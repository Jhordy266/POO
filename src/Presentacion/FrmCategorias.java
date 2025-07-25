/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Presentacion;

import Entidades.Categoria;
import Negocio.CategoriaNegocio;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author leona
 */
public class FrmCategorias extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmCategorias
     */
    private final CategoriaNegocio CONTROL;
    private String accion;
    private Categoria categoria;
    private String resp;
    private int Id_categoria;

    public FrmCategorias() {
        initComponents();
        this.CONTROL = new CategoriaNegocio();
        this.listar("");
        TabCategorias.setEnabledAt(1, false);
        TabCategorias.setEnabledAt(0, true);
        TabCategorias.setSelectedIndex(0);
    }

    private void listar(String texto) {
        TblCategorias.setModel(this.CONTROL.listar(texto));
    }

    private void limpiar() {
        this.TxtNombre.setText("");
        this.TxtDescripcion.setText("");
        this.ChkEstado.isSelected();
        this.accion = "Guardar";
        this.Id_categoria = 0;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabCategorias = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        LblBuscar = new javax.swing.JLabel();
        TxtBuscar = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TblCategorias = new javax.swing.JTable();
        BtnInsertar = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        LblDescripcion = new javax.swing.JLabel();
        TxtNombre = new javax.swing.JTextField();
        LblNombre = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtDescripcion = new javax.swing.JTextArea();
        BtnCerrar = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        ChkEstado = new javax.swing.JCheckBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Mantenimiento de Categorias");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        LblBuscar.setForeground(new java.awt.Color(0, 0, 0));
        LblBuscar.setText("Busqueda");

        TxtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtBuscarActionPerformed(evt);
            }
        });

        BtnBuscar.setForeground(new java.awt.Color(0, 0, 0));
        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        TblCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TblCategorias);

        BtnInsertar.setForeground(new java.awt.Color(0, 0, 0));
        BtnInsertar.setText("Insertar");
        BtnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInsertarActionPerformed(evt);
            }
        });

        BtnEditar.setForeground(new java.awt.Color(0, 0, 0));
        BtnEditar.setText("Editar");
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });

        BtnEliminar.setForeground(new java.awt.Color(0, 0, 0));
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
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LblBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnInsertar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEliminar)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblBuscar)
                    .addComponent(TxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar)
                    .addComponent(BtnInsertar)
                    .addComponent(BtnEditar)
                    .addComponent(BtnEliminar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        TabCategorias.addTab("LISTADO", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        LblDescripcion.setForeground(new java.awt.Color(51, 51, 51));
        LblDescripcion.setText("Descripción");

        LblNombre.setForeground(new java.awt.Color(0, 0, 0));
        LblNombre.setText("Nombre");

        TxtDescripcion.setColumns(20);
        TxtDescripcion.setRows(5);
        jScrollPane2.setViewportView(TxtDescripcion);

        BtnCerrar.setText("Cerrar");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        ChkEstado.setText("Activo");
        ChkEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChkEstadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblDescripcion)
                            .addComponent(LblNombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ChkEstado)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(BtnCerrar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnGuardar)))
                .addContainerGap(308, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNombre))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblDescripcion))
                .addGap(18, 18, 18)
                .addComponent(ChkEstado)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCerrar)
                    .addComponent(BtnGuardar))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        TabCategorias.addTab("MANTENIMIENTO", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabCategorias)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TabCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        TabCategorias.setEnabledAt(0, false);
        TabCategorias.setEnabledAt(1, true);
        TabCategorias.setSelectedIndex(1);
        this.accion = "Guardar";
        BtnGuardar.setText("Guardar");

    }//GEN-LAST:event_BtnInsertarActionPerformed

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        categoria = new Categoria();
        categoria.setNombre(this.TxtNombre.getText());
        categoria.setDescripcion(this.TxtDescripcion.getText());
        categoria.setEstado(this.ChkEstado.isSelected());
        if (this.accion.equals("Guardar")) {
            resp = this.CONTROL.insertar(categoria);
            if (resp.equals("Ok")) {
                JOptionPane.showMessageDialog(null, "Categoria registrado con exito");
                this.limpiar();
                this.listar("");
                TabCategorias.setEnabledAt(0, true);
                TabCategorias.setEnabledAt(1, false);
                TabCategorias.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(null, resp);
            }
        } else if (this.accion.equals("Editar")) {
            categoria.setId_Categoria(this.Id_categoria);
            resp = this.CONTROL.modificar(categoria);
            if (resp.equals("Ok")) {
                JOptionPane.showMessageDialog(null, "Categoria modificada con exito");
                this.limpiar();
                this.listar("");
                TabCategorias.setEnabledAt(0, true);
                TabCategorias.setEnabledAt(1, false);
                TabCategorias.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(null, resp);
            }
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed
        if (TblCategorias.getSelectedRowCount() == 1) {
            String Id_Categoria = String.valueOf(TblCategorias.getValueAt(TblCategorias.getSelectedRow(), 0));
            String Nombre = String.valueOf(TblCategorias.getValueAt(TblCategorias.getSelectedRow(), 1));
            String Descripcion = String.valueOf(TblCategorias.getValueAt(TblCategorias.getSelectedRow(), 2));
            String Estado = String.valueOf(TblCategorias.getValueAt(TblCategorias.getSelectedRow(), 3));
            boolean est;
            if (Estado == "Inactivo") {
                est = false;
            } else {
                est = true;
            }
            this.Id_categoria = Integer.parseInt(Id_Categoria);
            this.TxtNombre.setText(Nombre);
            this.TxtDescripcion.setText(Descripcion);
            this.ChkEstado.setSelected(est);
            TabCategorias.setEnabledAt(0, false);
            TabCategorias.setEnabledAt(1, true);
            TabCategorias.setSelectedIndex(1);
            this.accion = "Editar";
            BtnGuardar.setText("Editar");
        }
    }//GEN-LAST:event_BtnEditarActionPerformed

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
        if (TblCategorias.getSelectedRowCount() == 1) {
            String Id_Categoria = String.valueOf(TblCategorias.getValueAt(TblCategorias.getSelectedRow(), 0));
            int confirmacion = JOptionPane.showConfirmDialog(null,
                    "¿Estás seguro de eliminar esta categoría?",
                    "Confirmar",
                    JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                int id = Integer.parseInt(Id_Categoria);
                String resp = this.CONTROL.eliminar(id);
                if (resp.equals("Ok")) {
                    JOptionPane.showMessageDialog(null, "Categoría eliminada con éxito");
                    this.listar("");
                } else {
                    JOptionPane.showMessageDialog(null, resp);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una categoría a eliminar");
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        this.limpiar();
        TabCategorias.setEnabledAt(0, true);
        TabCategorias.setEnabledAt(1, false);
        TabCategorias.setSelectedIndex(0);
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void ChkEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChkEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChkEstadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnInsertar;
    private javax.swing.JCheckBox ChkEstado;
    private javax.swing.JLabel LblBuscar;
    private javax.swing.JLabel LblDescripcion;
    private javax.swing.JLabel LblNombre;
    private javax.swing.JTabbedPane TabCategorias;
    private javax.swing.JTable TblCategorias;
    private javax.swing.JTextField TxtBuscar;
    private javax.swing.JTextArea TxtDescripcion;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
