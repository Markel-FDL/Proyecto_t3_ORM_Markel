/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

//import com.mycompany.proyecto.ad.final2.entity.*;

import javax.swing.*;
import java.util.ArrayList;

/**
 * @author iker
 */
public class GestionPPP extends javax.swing.JFrame {

    static Operaciones operaciones = new Operaciones();
    static ArrayList<Proveedores> lproveedores;
    static ArrayList<Proyectos> lproyectos;
    static ArrayList<Piezas> lpiezas;

    /**
     * Creates new form Gpp
     */
    public GestionPPP() {
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

        jToolBar1 = new javax.swing.JToolBar();
        banadir = new javax.swing.JButton();
        bmodificar = new javax.swing.JButton();
        beliminar = new javax.swing.JButton();
        blistado = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboProveedor = new javax.swing.JComboBox<>();
        comboPieza = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboProyecto = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        proveedornombre = new javax.swing.JTextField();
        proveedorapellidos = new javax.swing.JTextField();
        piezanombre = new javax.swing.JTextField();
        piezaprecio = new javax.swing.JTextField();
        proyectonombre = new javax.swing.JTextField();
        proyectociudad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar1.setRollover(true);

        banadir.setText("Insertar");
        banadir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        banadir.setMargin(new java.awt.Insets(2, 30, 3, 30));
        banadir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        banadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banadirActionPerformed(evt);
            }
        });
        jToolBar1.add(banadir);

        bmodificar.setText("Modificar");
        bmodificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bmodificar.setMargin(new java.awt.Insets(2, 30, 3, 30));
        bmodificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmodificarActionPerformed(evt);
            }
        });
        jToolBar1.add(bmodificar);

        beliminar.setText("Eliminar");
        beliminar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        beliminar.setMargin(new java.awt.Insets(2, 30, 3, 30));
        beliminar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminarActionPerformed(evt);
            }
        });
        jToolBar1.add(beliminar);

        blistado.setText("Listado");
        blistado.setFocusable(false);
        blistado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        blistado.setMargin(new java.awt.Insets(2, 30, 3, 30));
        blistado.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        blistado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blistadoActionPerformed(evt);
            }
        });
        jToolBar1.add(blistado);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 7, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("Proveedor");

        comboProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProveedorActionPerformed(evt);
            }
        });

        comboPieza.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPiezaActionPerformed(evt);
            }
        });

        jLabel3.setText("Pieza");

        comboProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProyectoActionPerformed(evt);
            }
        });

        jLabel4.setText("Proyecto");

        jLabel5.setText("Cantidad");

        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(11, 11, 11)
                        .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addComponent(comboPieza, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(74, 74, 74)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboPieza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        proveedornombre.setEditable(false);

        proveedorapellidos.setEditable(false);

        piezanombre.setEditable(false);

        piezaprecio.setEditable(false);

        proyectonombre.setEditable(false);

        proyectociudad.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(proveedornombre, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(proveedorapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(piezaprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(piezanombre, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(proyectociudad, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proyectonombre, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(proveedornombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proveedorapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(piezanombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(piezaprecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(proyectonombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proyectociudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 51, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel2.setText("Relaciones piezas - proveedores - proyectos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarDatos();
    }//GEN-LAST:event_formWindowOpened

    private void cargarDatos() {
        lproyectos = operaciones.listarProyectos();
        String[] codigosOperacines = new String[lproyectos.size()];
        for (int i = 0; i < lproyectos.size(); i++) {
            codigosOperacines[i] = lproyectos.get(i).getCodigo();
        }
        DefaultComboBoxModel defaultComboBoxModel = new DefaultComboBoxModel(codigosOperacines);
        comboProyecto.setModel(defaultComboBoxModel);

        lproveedores = operaciones.listarProveedores();
        String[] codigosProveedores = new String[lproveedores.size()];
        for (int i = 0; i < lproveedores.size(); i++) {
            codigosProveedores[i] = lproveedores.get(i).getCodigo();
        }
        DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel(codigosProveedores);
        comboProveedor.setModel(defaultComboBoxModel2);

        lpiezas = operaciones.listarPiezas();
        String[] codigosPiezas = new String[lpiezas.size()];
        for (int i = 0; i < lpiezas.size(); i++) {
            codigosPiezas[i] = lpiezas.get(i).getCodigo();
        }
        DefaultComboBoxModel defaultComboBoxModel3 = new DefaultComboBoxModel(codigosPiezas);
        comboPieza.setModel(defaultComboBoxModel3);
    }

    private void comboProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProveedorActionPerformed
        Proveedores p;
        p = lproveedores.get(comboProveedor.getSelectedIndex());
        proveedornombre.setText(p.getNombre());
        proveedorapellidos.setText(p.getApellidos());
    }//GEN-LAST:event_comboProveedorActionPerformed

    private void comboPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPiezaActionPerformed
        Piezas p;
        p = lpiezas.get(comboPieza.getSelectedIndex());
        piezanombre.setText(p.getNombre());
        piezaprecio.setText(String.valueOf(p.getPrecio()));
    }//GEN-LAST:event_comboPiezaActionPerformed

    private void comboProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProyectoActionPerformed
        Proyectos p;
        p = lproyectos.get(comboProyecto.getSelectedIndex());
        proyectonombre.setText(p.getNombre());
        proyectociudad.setText(p.getCiudad());
    }//GEN-LAST:event_comboProyectoActionPerformed

    private void banadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banadirActionPerformed
        int cant;
        try {
            cant = Integer.parseInt(cantidad.getText());
        } catch (NumberFormatException e) {
            cant = Integer.MIN_VALUE;
        }
        if (cant != Integer.MIN_VALUE) {
            if (cant > 0) {
                String[] codigos = new String[3];
                codigos[0] = comboPieza.getSelectedItem().toString();
                codigos[1] = comboProyecto.getSelectedItem().toString();
                codigos[2] = comboProveedor.getSelectedItem().toString();
                Gestion g = new Gestion();
                g.setPiezasCodigo(codigos[0]);
                g.setProyectosCodigo(codigos[1]);
                g.setProveedoresCodigo(codigos[2]);
                switch (operaciones.anadirGestion(g)) {
                    case 0 -> JOptionPane.showMessageDialog(this, "Se ha insertado el dato de gestion correctamente");
                    case 1 -> JOptionPane.showMessageDialog(this, "Error de BD al insertar el dato de gestion", "Error insertar", JOptionPane.ERROR_MESSAGE);
                    case 2 -> JOptionPane.showMessageDialog(this, "Ya existe una dato de gestion con los mismos codigos", "Codigos duplicados", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La cantidad introducidad debe de ser mayor que 0", "Numero no valido", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Se debe introducir un numero como cantidad", "Cantidad incorrecta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_banadirActionPerformed

    private void bmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmodificarActionPerformed
        int cant;
        try {
            cant = Integer.parseInt(cantidad.getText());
        } catch (NumberFormatException e) {
            cant = Integer.MIN_VALUE;
        }
        if (cant != Integer.MIN_VALUE) {
            if (cant > 0) {
                String[] codigos = new String[3];
                codigos[0] = comboPieza.getSelectedItem().toString();
                codigos[1] = comboProyecto.getSelectedItem().toString();
                codigos[2] = comboProveedor.getSelectedItem().toString();
                switch (operaciones.actualizarGestion(codigos, cant)) {
                    case 0 -> JOptionPane.showMessageDialog(this, "Se ha eliminado la dato de gestion  correctamente");
                    case 1 ->
                            JOptionPane.showMessageDialog(this, "No se ha encontrado una dato de gestion \ncorrespondiente a los codigos intoducido", "Error codigo", JOptionPane.ERROR_MESSAGE);
                    case 2 ->
                            JOptionPane.showMessageDialog(this, "Error al eliminar en la BD", "Error BD", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "La cantidad introducidad debe de ser mayor que 0", "Numero no valido", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Se debe introducir un numero como cantidad", "Cantidad incorrecta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bmodificarActionPerformed

    private void beliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beliminarActionPerformed
        String[] codigos = new String[3];
        codigos[0] = comboPieza.getSelectedItem().toString();
        codigos[1] = comboProyecto.getSelectedItem().toString();
        codigos[2] = comboProveedor.getSelectedItem().toString();
        switch (operaciones.eliminarGestion(codigos)) {
            case 0 -> JOptionPane.showMessageDialog(this, "Se ha eliminado la dato de gestion  correctamente");
            case 1 ->
                    JOptionPane.showMessageDialog(this, "No se ha encontrado una dato de gestion \ncorrespondiente al codigo intoducido", "Error codigo", JOptionPane.ERROR_MESSAGE);
            case 2 ->
                    JOptionPane.showMessageDialog(this, "Error al eliminar en la BD", "Error BD", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_beliminarActionPerformed

    private void limpiarDatos(){
        cantidad.setText("");
    }

    private void blistadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blistadoActionPerformed
        TablaListadoGestion tablaListadoGestion = new TablaListadoGestion();
        tablaListadoGestion.setLocationRelativeTo(null);
        tablaListadoGestion.setVisible(true);
    }//GEN-LAST:event_blistadoActionPerformed

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
            java.util.logging.Logger.getLogger(GestionPPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionPPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionPPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionPPP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionPPP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton banadir;
    private javax.swing.JButton beliminar;
    private javax.swing.JButton blistado;
    private javax.swing.JButton bmodificar;
    private javax.swing.JTextField cantidad;
    private javax.swing.JComboBox<String> comboPieza;
    private javax.swing.JComboBox<String> comboProveedor;
    private javax.swing.JComboBox<String> comboProyecto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField piezanombre;
    private javax.swing.JTextField piezaprecio;
    private javax.swing.JTextField proveedorapellidos;
    private javax.swing.JTextField proveedornombre;
    private javax.swing.JTextField proyectociudad;
    private javax.swing.JTextField proyectonombre;
    // End of variables declaration//GEN-END:variables
}