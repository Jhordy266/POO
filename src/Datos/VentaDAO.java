/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

import Datos.Interfaces.IVenta;
import Entidades.DetalleVenta;
import Entidades.Tipo_Comprobante;
import Entidades.Cliente;
import Entidades.Venta;
import Conexion.Conexion;
import Entidades.Empleado;
import Entidades.Producto;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author leona
 */
public class VentaDAO implements IVenta<Venta, DetalleVenta> {

    private final Conexion CNX;
    private PreparedStatement ps;
    private ResultSet rs;
    private boolean resp;

    public VentaDAO() {
        CNX = Conexion.getInstancia();
    }

    @Override
    public List<Venta> listarVentas(String texto) {
        List<Venta> registros = new ArrayList();
        try {
            ps = CNX.conectar().prepareStatement("SELECT v.Id_Venta AS id, v.Id_Cliente AS persona_id, COALESCE(cn.NOMBRE, cj.RAZON_SOCIAL) AS persona_nombre, v.Tipocomprobante AS tipo_comprobante, v.SERIE AS serie_comprobante, v.NUMERO AS num_comprobante, v.FECHA AS fecha, v.IMPUESTO AS impuesto, v.MONTO_TOTAL AS total, CASE WHEN v.ESTADO = 1 THEN 'Activo' WHEN v.ESTADO = 0 THEN 'Anulado' ELSE 'Desconocido' END AS estado FROM VENTA v INNER JOIN CLIENTE c ON v.Id_Cliente = c.Id_Cliente LEFT JOIN CLIENTE_NATURAL cn ON c.Id_CNatural = cn.Id_CNatural LEFT JOIN CLIENTE_JURIDICO cj ON c.Id_CJuridico = cj.Id_CJuridico WHERE v.NUMERO LIKE ? ORDER BY v.Id_Venta ASC");
            ps.setString(1, "%" + texto + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                registros.add(new Venta(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7), rs.getDouble(8), rs.getDouble(9), rs.getString(10)));
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CNX.desconectar();
        }
        return registros;
    }

    @Override
    public List<DetalleVenta> listarDetallesVenta(int id) {
        List<DetalleVenta> registros = new ArrayList<>(); 
        try {
            ps = CNX.conectar().prepareStatement("SELECT dv.Id_Producto, p.Nombre, p.Stock, dv.Cantidad, dv.Precio_Unitario, dv.descuento, (dv.Cantidad * dv.Precio_Unitario) AS SubTotal FROM Detalle_Venta dv INNER JOIN Producto p ON dv.Id_Producto = p.Id_Producto WHERE dv.Id_Venta = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                // Obtenemos el descuento como un objeto para verificar si es NULL
                Object descuentoObj = rs.getObject(5);
                double descuento = 0.0; // Valor por defecto si es NULL

                if (descuentoObj != null) {
                    // Si no es NULL, intentamos convertirlo a Double
                    if (descuentoObj instanceof Number) {
                        descuento = ((Number) descuentoObj).doubleValue();
                    } else {
                        // Si no es un número pero no es null, esto podría indicar un problema de datos
                        System.err.println("Advertencia: El valor de 'descuento' no es un número: " + descuentoObj.toString());
                    }
                }

                registros.add(new DetalleVenta(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getDouble(5), descuento, rs.getDouble(7)));
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL al listar detalles de venta: " + e.getMessage(), "Error de Base de Datos", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                System.err.println("Error al cerrar PreparedStatement: " + e.getMessage());
            }
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.err.println("Error al cerrar ResultSet: " + e.getMessage());
            }
            CNX.desconectar(); 
        }
        return registros;
    }

    @Override
    public boolean insertarVenta(Venta venta) {
        resp = false;
        Connection conn = null;
        try {
            conn = CNX.conectar();
            conn.setAutoCommit(false);
            String sqlInsertVenta = "INSERT INTO venta (Id_Cliente,fecha,Tipocomprobante,serie,numero,impuesto,MONTO_TOTAL,estado) VALUES (?,now(),?,?,?,?,?,?)";

            ps = conn.prepareStatement(sqlInsertVenta, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, venta.getPersonaId());
            ps.setString(2, venta.getTipoComprobante());
            ps.setString(3, venta.getSerieComprobante());
            ps.setString(4, venta.getNumComprobante());
            ps.setDouble(5, venta.getImpuesto());
            ps.setDouble(6, venta.getTotal());
            ps.setString(7, "Aceptado");

            int filasAfectadas = ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            int idGenerado = 0;
            if (rs.next()) {
                idGenerado = rs.getInt(1);
            }

            if (filasAfectadas == 1) {
                String sqlInsertDetalle = "INSERT INTO detalle_venta (Id_Venta,Id_Producto,cantidad,PRECIO_UNITARIO,descuento) VALUES (?,?,?,?,?)";
                ps = conn.prepareStatement(sqlInsertDetalle);
                for (DetalleVenta item : venta.getDetalles()) {
                    ps.setInt(1, idGenerado);
                    ps.setInt(2, item.getArticuloId());
                    ps.setInt(3, item.getCantidad());
                    ps.setDouble(4, item.getPrecio());
                    ps.setDouble(5, item.getDescuento());
                    resp = ps.executeUpdate() > 0;
                }
                conn.commit();
            } else {
                conn.rollback();
            }
        } catch (SQLException e) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(VentaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return resp;

    }

    @Override
    public boolean anularVenta(int id) {
        resp = false;
        try {
            ps = CNX.conectar().prepareStatement("UPDATE venta SET estado='Anulado' WHERE id=?");
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                resp = true;
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            CNX.desconectar();
        }
        return resp;
    }

    @Override
    public boolean existeVenta(String numeroSerie, String numeroComprobante) {
        resp = false;
        try {
            ps = CNX.conectar().prepareStatement("SELECT Id_Venta FROM venta WHERE serie = ? AND numero = ?");
            ps.setString(1, numeroSerie);
            ps.setString(2, numeroComprobante);
            rs = ps.executeQuery();
            if (rs.next()) {
                resp = true;
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CNX.desconectar();
        }
        return resp;
    }

    public String ultimoSerie(String tipoComprobante) {
        String serieComprobante = "";
        try {
            ps = CNX.conectar().prepareStatement("SELECT serie FROM venta where tipocomprobante = ? order by serie desc limit 1");
            ps.setString(1, tipoComprobante);
            rs = ps.executeQuery();

            while (rs.next()) {
                serieComprobante = rs.getString("serie");
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CNX.desconectar();
        }
        return serieComprobante;
    }

    public String ultimoNumero(String tipoComprobante, String serieComprobante) {
        String numComprobante = "";
        try {
            ps = CNX.conectar().prepareStatement("SELECT numero FROM venta WHERE tipocomprobante = ? AND serie = ? order by numero desc limit 1");
            ps.setString(1, tipoComprobante);
            ps.setString(2, serieComprobante);
            rs = ps.executeQuery();

            while (rs.next()) {
                numComprobante = rs.getString("numero");
            }
            ps.close();
            rs.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } finally {
            ps = null;
            rs = null;
            CNX.desconectar();
        }
        return numComprobante;
    }

}
