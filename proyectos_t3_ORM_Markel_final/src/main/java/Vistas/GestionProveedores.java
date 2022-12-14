/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import com.mycompany.proyectos_t3_orm_markel_final.Operaciones;
import com.mycompany.proyectos_t3_orm_markel_final.ProveedoresEntity;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @author 9fdam05
 */
public class GestionProveedores extends javax.swing.JFrame {
    static Operaciones operaciones = new Operaciones();

    static ArrayList<ProveedoresEntity> listaProveedores;

    static int contador = 0;

    /**
     * Creates new form GestionProveedores
     */
    public GestionProveedores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        apellidoProv = new javax.swing.JTextField();
        direccionProv = new javax.swing.JTextField();
        nombreProv = new javax.swing.JTextField();
        insertarBoton = new javax.swing.JButton();
        modificarBoton = new javax.swing.JButton();
        limpiarBoton = new javax.swing.JButton();
        eliminarBoton = new javax.swing.JButton();
        codigoProv = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        datoApellidos = new javax.swing.JTextField();
        datoDireccion = new javax.swing.JTextField();
        datonombre = new javax.swing.JTextField();
        banterior = new javax.swing.JButton();
        bsiguiente = new javax.swing.JButton();
        bprimero = new javax.swing.JButton();
        bultimo = new javax.swing.JButton();
        numeros = new javax.swing.JLabel();
        datoCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel1.setText("Codigo del proveedor:");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Apellidos: ");

        jLabel4.setText("Direccion: ");

        nombreProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProvActionPerformed(evt);
            }
        });

        insertarBoton.setText("Insertar");
        insertarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertarBotonActionPerformed(evt);
            }
        });

        modificarBoton.setText("Modificar");
        modificarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBotonActionPerformed(evt);
            }
        });

        limpiarBoton.setText("Limpiar");
        limpiarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBotonActionPerformed(evt);
            }
        });

        eliminarBoton.setText("Eliminar");
        eliminarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBotonActionPerformed(evt);
            }
        });

        codigoProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoProvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreProv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidoProv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccionProv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(codigoProv, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modificarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(limpiarBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertarBoton)
                    .addComponent(eliminarBoton))
                .addGap(116, 116, 116))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {apellidoProv, direccionProv, nombreProv});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codigoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(direccionProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiarBoton)
                    .addComponent(insertarBoton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarBoton)
                    .addComponent(eliminarBoton))
                .addGap(32, 32, 32))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4});

        jTabbedPane1.addTab("Gestion de proveedores", jPanel1);

        jLabel5.setText("Codigo del proveedor");

        jLabel6.setText("Nombre");

        jLabel7.setText("Apellidos");

        jLabel8.setText("Direccion");

        datoApellidos.setEditable(false);

        datoDireccion.setEditable(false);

        datonombre.setEditable(false);
        datonombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datonombreActionPerformed(evt);
            }
        });

        banterior.setText("<<");
        banterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banteriorActionPerformed(evt);
            }
        });

        bsiguiente.setText(">>");
        bsiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsiguienteActionPerformed(evt);
            }
        });

        bprimero.setText("|<<");
        bprimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprimeroActionPerformed(evt);
            }
        });

        bultimo.setText(">>|");
        bultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bultimoActionPerformed(evt);
            }
        });

        numeros.setText("1/2");

        datoCodigo.setEditable(false);
        datoCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoCodigoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(datoCodigo))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datonombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datoApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(datoDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(numeros)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bprimero)
                    .addComponent(banterior))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bsiguiente)
                    .addComponent(bultimo))
                .addGap(107, 107, 107))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(datonombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numeros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bprimero)
                    .addComponent(bultimo))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsiguiente)
                    .addComponent(banterior))
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("Listado de Proveedores", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProvActionPerformed

    private void insertarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarBotonActionPerformed
        if (!codigoProv.getText().equals("") && !nombreProv.getText().equals("") && !apellidoProv.getText().equals("") && !direccionProv.getText().equals("")) {
            ProveedoresEntity p = new ProveedoresEntity();
            p.setCodigo(codigoProv.getText().toUpperCase());
            p.setNombre(nombreProv.getText());
            p.setApellidos(apellidoProv.getText());
            p.setDireccion(direccionProv.getText());
            switch (operaciones.anadirProveedor(p)) {
                case 0 :
                    JOptionPane.showMessageDialog(this, "<< Proveedor correctamente insertado >>");
                case 1 :
                    JOptionPane.showMessageDialog(this, "<< Error al insertar proveedor >>", "Error al insertar", JOptionPane.ERROR_MESSAGE);
                case 2 :
                    JOptionPane.showMessageDialog(this, "<< El codigo ya existe >>", "Codigo existente", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "<< Faltan campos por rellenar para realizar la insercion >>", "Parametros vacion", JOptionPane.ERROR_MESSAGE);
        }
        limpiarDatos();
    }//GEN-LAST:event_insertarBotonActionPerformed

    private void modificarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBotonActionPerformed
        ProveedoresEntity p = new ProveedoresEntity();
        if (!codigoProv.getText().equals("")) {
            p.setCodigo(codigoProv.getText());
            p.setNombre(nombreProv.getText());
            p.setApellidos(apellidoProv.getText());
            p.setDireccion(direccionProv.getText());
            switch (operaciones.actualizarProveedor(p)) {
                case 0 :
                    JOptionPane.showMessageDialog(this, "<< Proveedor actualizado correctamente >>");
                case 1 :
                    JOptionPane.showMessageDialog(this, "<< No se ha encontrado proveedor >>", "Error de codigo", JOptionPane.ERROR_MESSAGE);
                case 2 :
                    JOptionPane.showMessageDialog(this, "<< Error al actualizar >>", "Error de BD", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "<< Codigo no introducido para modificar proveedor >>", "Codigo vacio", JOptionPane.WARNING_MESSAGE);
        }
        limpiarDatos();
    }//GEN-LAST:event_modificarBotonActionPerformed

    private void limpiarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBotonActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_limpiarBotonActionPerformed


    private void eliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBotonActionPerformed
        ProveedoresEntity p = new ProveedoresEntity();
        if (!codigoProv.getText().equals("")) {
            int opcion = JOptionPane.showConfirmDialog(this, "<< ??Estas seguro de eliminar? >>", "Confirmacion de borrado", JOptionPane.YES_NO_OPTION);
            if (opcion == 0) {
                p.setCodigo(codigoProv.getText());
                switch (operaciones.eliminarProveedor(p)) {
                    case 0 :
                        JOptionPane.showMessageDialog(this, "<< Proveedor eliminado correctamente");
                    case 1 :
                        JOptionPane.showMessageDialog(this, "<< No se ha encontrado proveedor >>", "Codigo erroneo", JOptionPane.ERROR_MESSAGE);
                    case 2 :
                        JOptionPane.showMessageDialog(this, "<< Error al eliminar >>", "Error de BD", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "<< Se ha cancelado la accion >>", "Accion cancelada", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "<< Falta el codigo del proveedor para eliminar >>", "Falta de codigo", JOptionPane.WARNING_MESSAGE);
        }
        limpiarDatos();
    }//GEN-LAST:event_eliminarBotonActionPerformed

    private void limpiarDatos() {
        codigoProv.setText("");
        nombreProv.setText("");
        apellidoProv.setText("");
        direccionProv.setText("");
    }

    private void datonombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datonombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datonombreActionPerformed

    private void banteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banteriorActionPerformed
        if (contador > 0 ){
            contador--;
            cargarProveedor(contador);
        }
    }//GEN-LAST:event_banteriorActionPerformed

    private void bsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsiguienteActionPerformed
        if (contador < (listaProveedores.size() - 1) ){
            contador++;
            cargarProveedor(contador);
        }
    }//GEN-LAST:event_bsiguienteActionPerformed

    private void bprimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprimeroActionPerformed
        contador = 0;
        cargarProveedor(contador);
    }//GEN-LAST:event_bprimeroActionPerformed

    private void bultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bultimoActionPerformed
        contador = listaProveedores.size() - 1;
        cargarProveedor(contador);
    }//GEN-LAST:event_bultimoActionPerformed

    private void codigoProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoProvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoProvActionPerformed

    private void datoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datoCodigoActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        cargarTab();
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void cargarTab() {
        listaProveedores = operaciones.listarProveedores();
        contador = 0;
        cargarProveedor(contador);
    }

    private void cargarProveedor(int contador) {
        if (!listaProveedores.isEmpty()) {
            numeros.setText(contador + 1 + "/" + listaProveedores.size());
            datoCodigo.setText(listaProveedores.get(contador).getCodigo());
            datonombre.setText(listaProveedores.get(contador).getNombre());
            datoApellidos.setText(listaProveedores.get(contador).getApellidos());
            datoDireccion.setText(listaProveedores.get(contador).getDireccion());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GestionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionProveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionProveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoProv;
    private javax.swing.JButton banterior;
    private javax.swing.JButton bprimero;
    private javax.swing.JButton bsiguiente;
    private javax.swing.JButton bultimo;
    private javax.swing.JTextField codigoProv;
    private javax.swing.JTextField datoApellidos;
    private javax.swing.JTextField datoCodigo;
    private javax.swing.JTextField datoDireccion;
    private javax.swing.JTextField datonombre;
    private javax.swing.JTextField direccionProv;
    private javax.swing.JButton eliminarBoton;
    private javax.swing.JButton insertarBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton limpiarBoton;
    private javax.swing.JButton modificarBoton;
    private javax.swing.JTextField nombreProv;
    private javax.swing.JLabel numeros;
    // End of variables declaration//GEN-END:variables
}
