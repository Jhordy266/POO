/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Presentacion;

import Entidades.Cliente;
import Entidades.Tipo_Cliente;
import Negocio.ClienteNegocio;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author leona
 */
public class FrmClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmClientes
     */
    private final ClienteNegocio CONTROL;
    private String accion;
    private Cliente cliente;
    private String resp;
    private int Id_cliente;

    public FrmClientes() {
        initComponents();
        this.CONTROL = new ClienteNegocio();
        this.listar("");
        this.cargarTCliente();
        TabClientes.setEnabledAt(1, false);
        TabClientes.setEnabledAt(0, true);
        TabClientes.setSelectedIndex(0);
        this.accion = "Guardar";
    }

    private void listar(String texto) {
        TblClientes.setModel(this.CONTROL.listar(texto));
    }

    private void limpiar() {
        this.TxtNombre.setText("");
        this.TxtDoc.setText("");
        this.TxtDireccion.setText("");
        this.TxtTelefono.setText("");

        /* MODIFICACIÓN PARA LOS COMBOBOXES CON setSelectedIndex(-1) */
        if (CbxTCliente.getItemCount() > 0) {
            this.CbxTCliente.setSelectedIndex(-1);
        } else {
            this.CbxTCliente.setSelectedItem(null);
        }

        this.accion = "Guardar";
        this.Id_cliente = 0;
        this.cliente = null;
    }

    private void cargarTCliente() {
        CbxTCliente.setModel(this.CONTROL.seleccionar());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabClientes = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        LblBuscar = new javax.swing.JLabel();
        TxtBuscar = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblClientes = new javax.swing.JTable();
        BtnInsertar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        CbxTCliente = new javax.swing.JComboBox<>();
        LblNombre = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        LblDoc = new javax.swing.JLabel();
        TxtDoc = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();
        BtnCerrar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtDireccion = new javax.swing.JTextArea();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Mantenimiento de Clientes");

        TabClientes.setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        LblBuscar.setForeground(new java.awt.Color(0, 0, 0));
        LblBuscar.setText("Busqueda");

        TxtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscarActionPerformed(evt);
            }
        });

        BtnBuscar.setText("BUSCAR");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        TblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TblClientes);

        BtnInsertar.setText("Insertar");
        BtnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInsertarActionPerformed(evt);
            }
        });

        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(LblBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnInsertar)
                .addGap(33, 33, 33)
                .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BtnEliminar)
                .addGap(118, 118, 118))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblBuscar)
                    .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar)
                    .addComponent(BtnInsertar)
                    .addComponent(BtnEditar)
                    .addComponent(BtnEliminar))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        TabClientes.addTab("LISTADO", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo de Cliente");

        CbxTCliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbxTClienteItemStateChanged(evt);
            }
        });
        CbxTCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxTClienteActionPerformed(evt);
            }
        });

        LblNombre.setForeground(new java.awt.Color(0, 0, 0));
        LblNombre.setText("Nombre");

        LblDoc.setForeground(new java.awt.Color(0, 0, 0));
        LblDoc.setText("DNI");

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Dirección");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Telefono");

        BtnCerrar.setForeground(new java.awt.Color(0, 0, 0));
        BtnCerrar.setText("Cerrar");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        BtnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        TxtDireccion.setColumns(20);
        TxtDireccion.setRows(5);
        jScrollPane2.setViewportView(TxtDireccion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(LblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblDoc)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnCerrar)
                        .addGap(48, 48, 48)
                        .addComponent(BtnGuardar))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CbxTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TxtDoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(505, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CbxTCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNombre)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblDoc)
                    .addComponent(TxtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCerrar)
                    .addComponent(BtnGuardar))
                .addGap(32, 32, 32))
        );

        TabClientes.addTab("MANTENIMIENTO", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabClientes, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabClientes, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtBuscarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        this.listar(this.TxtBuscar.getText());
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInsertarActionPerformed
        this.limpiar();
        TabClientes.setEnabledAt(0, false);
        TabClientes.setEnabledAt(1, true);
        TabClientes.setSelectedIndex(1);
        this.accion = "Guardar";
        BtnGuardar.setText("Guardar");
    }//GEN-LAST:event_BtnInsertarActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        if (TabClientes.getSelectedIndex() != 0) {
            JOptionPane.showMessageDialog(this, "Debe estar en la pestaña 'Listado' para editar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            TabClientes.setSelectedIndex(0);
            return;
        }

        // Verifica que haya exactamente una fila seleccionada
        if (TblClientes.getSelectedRowCount() == 1) {
            try {
                int fila = TblClientes.getSelectedRow();
                String idClienteStr = String.valueOf(TblClientes.getValueAt(fila, 0));
                int idCliente = Integer.parseInt(idClienteStr);

                // Obtener cliente completo desde la capa de negocio
                Cliente clienteEditado = this.CONTROL.obtenerClientePorId(idCliente);

                if (clienteEditado == null) {
                    JOptionPane.showMessageDialog(this, "No se pudo encontrar el cliente para editar.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Guardamos el cliente y el ID para la acción de guardar
                this.cliente = clienteEditado;
                this.Id_cliente = clienteEditado.getId_Cliente();
                this.accion = "Editar";

                // Cargamos campos comunes
                TxtDireccion.setText(clienteEditado.getDireccion());
                TxtTelefono.setText(clienteEditado.getTelefono());
                CbxTCliente.setSelectedItem(clienteEditado.getTipoCliente());

                // Cargamos campos específicos por tipo de cliente
                if (clienteEditado.getClienteNatural() != null) {
                    TxtNombre.setText(clienteEditado.getClienteNatural().getNombre());
                    TxtDoc.setText(clienteEditado.getClienteNatural().getDNI());
                } else if (clienteEditado.getClienteJuridico() != null) {
                    TxtNombre.setText(clienteEditado.getClienteJuridico().getRaz_Social());
                    TxtDoc.setText(clienteEditado.getClienteJuridico().getRUC());
                } else {
                    TxtNombre.setText("");
                    TxtDoc.setText("");
                }

                // Cambiar a la pestaña de mantenimiento
                TabClientes.setEnabledAt(1, true);
                TabClientes.setEnabledAt(0, false);
                TabClientes.setSelectedIndex(1);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al intentar cargar cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un solo cliente para editar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        if (TabClientes.getSelectedIndex() != 0) {
            JOptionPane.showMessageDialog(this, "Debe estar en la pestaña 'Listado' para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            TabClientes.setSelectedIndex(0);
            return;
        }

        if (TblClientes.getSelectedRowCount() == 1) {
            String idTabla = String.valueOf(TblClientes.getValueAt(TblClientes.getSelectedRow(), 0));
            String tipo = String.valueOf(TblClientes.getValueAt(TblClientes.getSelectedRow(), 1)); // Esta variable 'tipo' no se usa en la eliminación actual.

            try {
                int idClienteAEliminar = Integer.parseInt(idTabla);

                int opcion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar este cliente?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);

                if (opcion == JOptionPane.YES_OPTION) {
                    String resp = this.CONTROL.eliminar(idClienteAEliminar);

                    if (resp.equals("OK")) {
                        JOptionPane.showMessageDialog(this, "Cliente eliminado con éxito.", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                        this.limpiar();
                        this.listar("");
                    } else {
                        JOptionPane.showMessageDialog(this, resp, "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Error de Formato: El ID del cliente no es un número válido.\nDetalles: " + e.getMessage(), "Error de Formato", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error inesperado al eliminar cliente: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un solo cliente para eliminar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void CbxTClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxTClienteActionPerformed
        /**/
    }//GEN-LAST:event_CbxTClienteActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        this.limpiar();
        this.listar("");
        TabClientes.setEnabledAt(0, true);
        TabClientes.setEnabledAt(1, false);
        TabClientes.setSelectedIndex(0);
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        String nombre = TxtNombre.getText().trim();
        String documento = TxtDoc.getText().trim();
        String direccion = TxtDireccion.getText().trim();
        String telefono = TxtTelefono.getText().trim();
        Tipo_Cliente tipoCSeleccionada = (Tipo_Cliente) this.CbxTCliente.getSelectedItem();

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre del cliente no puede estar vacío.", "Error de Validación", JOptionPane.WARNING_MESSAGE);
            TxtNombre.requestFocus();
            return;
        }
        if (documento.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El documento del cliente no puede estar vacío.", "Error de Validación", JOptionPane.WARNING_MESSAGE);
            TxtDoc.requestFocus();
            return;
        }
        if (direccion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La dirección del cliente no puede estar vacía.", "Error de Validación", JOptionPane.WARNING_MESSAGE);
            TxtDireccion.requestFocus();
            return;
        }
        if (telefono.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El teléfono del cliente no puede estar vacío.", "Error de Validación", JOptionPane.WARNING_MESSAGE);
            TxtTelefono.requestFocus();
            return;
        }
        if (tipoCSeleccionada == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de cliente.", "Error de Validación", JOptionPane.WARNING_MESSAGE);
            CbxTCliente.requestFocus();
            return;
        }

        if (this.cliente == null || !this.accion.equals("Editar")) {
            cliente = new Entidades.Cliente();
        }

        cliente.setNombre(nombre);
        cliente.setDocumento(documento);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        cliente.setId_TipoCliente(tipoCSeleccionada.getId_TipoCliente());
        cliente.setTipoCliente(tipoCSeleccionada);

        if (tipoCSeleccionada.getNombre().equalsIgnoreCase("Natural")) {
            Entidades.Cliente_Natural clienteNatural = new Entidades.Cliente_Natural();
            clienteNatural.setNombre(nombre);
            clienteNatural.setDNI(documento);
            cliente.setClienteNatural(clienteNatural);
            cliente.setClienteJuridico(null);
        } else if (tipoCSeleccionada.getNombre().equalsIgnoreCase("Juridico") || tipoCSeleccionada.getNombre().equalsIgnoreCase("Jurídico")) {
            Entidades.Cliente_Juridico clienteJuridico = new Entidades.Cliente_Juridico();
            clienteJuridico.setRaz_Social(nombre);
            clienteJuridico.setRUC(documento);
            cliente.setClienteJuridico(clienteJuridico);
            cliente.setClienteNatural(null);
        } else {
            JOptionPane.showMessageDialog(this, "Error: Tipo de cliente no reconocido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (this.accion.equals("Guardar")) {
            resp = this.CONTROL.insertar(cliente);
            if (resp.equals("Ok")) {
                JOptionPane.showMessageDialog(null, "Cliente registrado con éxito", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                this.limpiar();
                this.listar("");
                TabClientes.setEnabledAt(0, true);
                TabClientes.setEnabledAt(1, false);
                TabClientes.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar cliente: " + resp, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (this.accion.equals("Editar")) {
            cliente.setId_Cliente(this.Id_cliente);
            resp = this.CONTROL.modificar(cliente);  // ← Esto devuelve "OK" si fue correcto

            if (resp.equalsIgnoreCase("OK")) {
                JOptionPane.showMessageDialog(this, "Cliente modificado con éxito", "Operación Exitosa", JOptionPane.INFORMATION_MESSAGE);
                this.limpiar();
                this.listar("");
                TabClientes.setEnabledAt(0, true);
                TabClientes.setEnabledAt(1, false);
                TabClientes.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(this, "Error al modificar cliente: " + resp, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void CbxTClienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbxTClienteItemStateChanged
        CbxTCliente.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent evt) {
                // Verificar que el estado del evento sea SELECTED (cuando se elige un nuevo ítem)
                if (evt.getStateChange() == ItemEvent.SELECTED) {
                    // Obtener el objeto seleccionado del ComboBox
                    Tipo_Cliente tipoCSeleccionado = (Tipo_Cliente) CbxTCliente.getSelectedItem();

                    // Verificar si el tipo seleccionado no es nulo
                    if (tipoCSeleccionado != null) {
                        // Obtener el nombre del tipo de cliente
                        String nombreTipo = tipoCSeleccionado.getNombre();

                        // Verificar si el nombre es "Juridico" o "Natural"
                        if (nombreTipo.equalsIgnoreCase("Cliente Juridico") || nombreTipo.equalsIgnoreCase("Cliente Jurídico")) {
                            // Si es Jurídico, cambiar los textos de los labels
                            LblNombre.setText("Razón Social:");
                            LblDoc.setText("RUC:");

                            // Limpiar los campos de texto
                            TxtNombre.setText("");
                            TxtDoc.setText("");
                        } else if (nombreTipo.equalsIgnoreCase("Cliente Natural")) {
                            // Si es Natural, restaurar los textos originales
                            LblNombre.setText("Nombre:");
                            LblDoc.setText("DNI:");

                            // Limpiar los campos de texto
                            TxtNombre.setText("");
                            TxtDoc.setText("");
                        }
                    }
                }
            }
        });
    }//GEN-LAST:event_CbxTClienteItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnInsertar;
    private javax.swing.JComboBox<Tipo_Cliente> CbxTCliente;
    private javax.swing.JLabel LblBuscar;
    private javax.swing.JLabel LblDoc;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JTabbedPane TabClientes;
    private javax.swing.JTable TblClientes;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextArea TxtDireccion;
    private javax.swing.JTextField TxtDoc;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
