/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;


import com.mycompany.proyectos_t3_orm_markel_final.Operaciones;
import com.mycompany.proyectos_t3_orm_markel_final.ProyectosEntity;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @author 9fdam05
 */
public class GestionProyectos extends javax.swing.JFrame {
    static Operaciones operaciones = new Operaciones();

    static ArrayList<ProyectosEntity> listaProyectos;

    static int contador = 1;

    /**
     * Creates new form GestionProyectos
     */
    public GestionProyectos() {
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
        ciudadProy = new javax.swing.JTextField();
        nombreProy = new javax.swing.JTextField();
        insertarBoton = new javax.swing.JButton();
        modificarBoton = new javax.swing.JButton();
        limpiarBoton = new javax.swing.JButton();
        eliminarBoton = new javax.swing.JButton();
        codProy = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        datoCiudad = new javax.swing.JTextField();
        datoNombre = new javax.swing.JTextField();
        banterior = new javax.swing.JButton();
        bsiguiente = new javax.swing.JButton();
        bprimero = new javax.swing.JButton();
        bultimo = new javax.swing.JButton();
        numero = new javax.swing.JLabel();
        datoCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

        jLabel1.setText("Codigo del proyecto: ");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("Ciudad: ");

        nombreProy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProyActionPerformed(evt);
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

        codProy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codProyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(codProy))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreProy, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ciudadProy, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(62, Short.MAX_VALUE))
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

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ciudadProy, nombreProy});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(codProy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombreProy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ciudadProy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limpiarBoton)
                    .addComponent(insertarBoton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarBoton)
                    .addComponent(eliminarBoton))
                .addGap(32, 32, 32))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3});

        jTabbedPane1.addTab("Gestion de proyectos", jPanel1);

        jLabel5.setText("Codigo del proveedor: ");

        jLabel6.setText("Nombre: ");

        jLabel7.setText("Ciudad: ");

        datoCiudad.setEditable(false);

        datoNombre.setEditable(false);
        datoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datoNombreActionPerformed(evt);
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

        numero.setText("1/2");

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
                        .addGap(44, 44, 44)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(datoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(datoCodigo))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(25, 25, 25)
                                    .addComponent(datoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(bprimero)
                                        .addComponent(banterior))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bsiguiente)
                                        .addComponent(bultimo))
                                    .addGap(33, 33, 33)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(numero)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(datoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(datoCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(numero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bprimero)
                    .addComponent(bultimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bsiguiente)
                    .addComponent(banterior))
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("Listado de proyectos", jPanel3);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreProyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProyActionPerformed

    private void insertarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertarBotonActionPerformed
        if (!codProy.getText().equals("") && !nombreProy.getText().equals("") && !ciudadProy.getText().equals("")) {
            ProyectosEntity p = new ProyectosEntity();
            p.setCodigo(codProy.getText().toUpperCase());
            p.setNombre(nombreProy.getText());
            p.setCiudad(ciudadProy.getText());
            switch (operaciones.anadirProyecto(p)) {
                case 0 :
                    JOptionPane.showMessageDialog(this, "<< Se ha insertado el nuevo proveedor correctamente >>");
                case 1 :
                    JOptionPane.showMessageDialog(this, "<< Error al insertar proveedor >>", "Error de insercion", JOptionPane.ERROR_MESSAGE);
                case 2 :
                    JOptionPane.showMessageDialog(this, "<< Proveedor existente con ese codigo >>", "Codigo existente", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "<< Faltan datos para insertar >>", "Faltan datos", JOptionPane.ERROR_MESSAGE);
        }
        limpiarDatos();
    }//GEN-LAST:event_insertarBotonActionPerformed

    private void modificarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBotonActionPerformed
        ProyectosEntity p = new ProyectosEntity();
        if (!codProy.getText().equals("")) {
            p.setCodigo(codProy.getText());
            p.setNombre(nombreProy.getText());
            p.setCiudad(ciudadProy.getText());
            switch (operaciones.actualizarProyecto(p)) {
                case 0 :
                    JOptionPane.showMessageDialog(this, "<< Actualizado correctamente >>");
                case 1 :
                    JOptionPane.showMessageDialog(this, "<< No se ha encontrado proveedor >>", "Error de codigo", JOptionPane.ERROR_MESSAGE);
                case 2 :
                    JOptionPane.showMessageDialog(this, "<< Error al actualizar >>", "Error de BD", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "<< Introduce un codigo para modificar un proyecto >>", "Falta de codigo", JOptionPane.WARNING_MESSAGE);
        }
        limpiarDatos();
    }//GEN-LAST:event_modificarBotonActionPerformed

    private void limpiarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBotonActionPerformed
        limpiarDatos();
    }//GEN-LAST:event_limpiarBotonActionPerformed

    private void eliminarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBotonActionPerformed
        ProyectosEntity p = new ProyectosEntity();
        if (!codProy.getText().equals("")) {
            int opcion = JOptionPane.showConfirmDialog(this, "<< ??Estas seguro de eliminar? >>", "Borrado", JOptionPane.YES_NO_OPTION);
            if (opcion == 0) {
                p.setCodigo(codProy.getText());
                switch (operaciones.eliminarProyecto(p)) {
                    case 0 :
                        JOptionPane.showMessageDialog(this, "<< Se ha eliminado el proyecto correctamente >>");
                    case 1 :
                        JOptionPane.showMessageDialog(this, "<< No hay proyecto con el codigo intoducido", "Error de codigo", JOptionPane.ERROR_MESSAGE);
                    case 2 :
                        JOptionPane.showMessageDialog(this, "<< Error al eliminar >>", "Error de BD", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "<< Se ha cancelado la accion >>", "Cancelacion de accion", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "<< Falta codigo para eliminar un proyecto >>", "Codigo vacio", JOptionPane.WARNING_MESSAGE);
        }
        limpiarDatos();
    }//GEN-LAST:event_eliminarBotonActionPerformed

    private void limpiarDatos() {
        nombreProy.setText("");
        ciudadProy.setText("");
        codProy.setText("");
    }

    private void datoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datoNombreActionPerformed

    private void banteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banteriorActionPerformed
        if (contador > 0 ){
            contador--;
            cargarProyecto(contador);
        }
    }//GEN-LAST:event_banteriorActionPerformed

    private void bsiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsiguienteActionPerformed
        if (contador < (listaProyectos.size() - 1) ){
            contador++;
            cargarProyecto(contador);
        }
    }//GEN-LAST:event_bsiguienteActionPerformed

    private void bprimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprimeroActionPerformed
        contador = 0;
        cargarProyecto(contador);
    }//GEN-LAST:event_bprimeroActionPerformed

    private void bultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bultimoActionPerformed
        contador = listaProyectos.size() - 1;
        cargarProyecto(contador);
    }//GEN-LAST:event_bultimoActionPerformed

    private void codProyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codProyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codProyActionPerformed

    private void datoCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datoCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datoCodigoActionPerformed

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged
        cargarTab();
    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void cargarTab() {
        listaProyectos = operaciones.listarProyectos();
        contador = 0;
        cargarProyecto(contador);
    }

    private void cargarProyecto(int contador) {
        if (!listaProyectos.isEmpty()) {
            numero.setText(contador + 1 + "/" + listaProyectos.size());
            datoCodigo.setText(listaProyectos.get(contador).getCodigo());
            datoNombre.setText(listaProyectos.get(contador).getNombre());
            datoCiudad.setText(listaProyectos.get(contador).getCiudad());
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
            java.util.logging.Logger.getLogger(GestionProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionProyectos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionProyectos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton banterior;
    private javax.swing.JButton bprimero;
    private javax.swing.JButton bsiguiente;
    private javax.swing.JButton bultimo;
    private javax.swing.JTextField ciudadProy;
    private javax.swing.JTextField codProy;
    private javax.swing.JTextField datoCiudad;
    private javax.swing.JTextField datoCodigo;
    private javax.swing.JTextField datoNombre;
    private javax.swing.JButton eliminarBoton;
    private javax.swing.JButton insertarBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton limpiarBoton;
    private javax.swing.JButton modificarBoton;
    private javax.swing.JTextField nombreProy;
    private javax.swing.JLabel numero;
    // End of variables declaration//GEN-END:variables
}
