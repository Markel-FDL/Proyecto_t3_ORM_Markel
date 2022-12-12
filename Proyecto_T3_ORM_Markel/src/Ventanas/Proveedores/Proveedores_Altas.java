package Ventanas.Proveedores;

import com.company.ProveedoresEntity;
import com.company.hibernate.Utils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Proveedores_Altas {
    public JPanel Contenedor_Principal;
    private JLabel codigo_proveedor_label;
    private JTextField codigo_textfield;
    private JLabel nombre_proveedor_label;
    private JTextField nombre_textfield;
    private JLabel apellidos_proveedor_label;
    private JTextField apellidos_textfield;
    private JLabel direccion_proveedor_label;
    private JTextField direccion_textfield;
    private JButton limpiar_probeedor_button;
    private JButton insertar_proveedor_button;
public Proveedores_Altas() {
    insertar_proveedor_button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre = nombre_textfield.getText();
            String apellidos = apellidos_textfield.getText();
            String direccion = direccion_textfield.getText();

            String acciones = insertProveedor(nombre, apellidos, direccion);
            if (acciones.equals("ok")) {
                JOptionPane.showMessageDialog(null, "Proveedor insertado correctamente");
                vaciar();
            } else {
                JOptionPane.showMessageDialog(null, acciones);
            }

        }
    });
}

// SECCIÓN INSERTAR

    public static String insertProveedor(String nombre, String apellidos, String direccion) {
        String accion = validarCampos("idVacio", nombre, apellidos, direccion);
        if(accion.equals("")){
            ProveedoresEntity proveedor = new ProveedoresEntity();
            proveedor.setNombre(nombre);
            proveedor.setApellidos(apellidos);
            proveedor.setDireccion(direccion);
            Utils.save(proveedor);
            accion = "ok";
        }
        return accion;
    }

    private void vaciar(){
        codigo_textfield.setText("");
        nombre_textfield.setText("");
        apellidos_textfield.setText("");
        direccion_textfield.setText("");
    }

    private static String validarCampos(String id, String nombre, String apellidos, String direccion){
        String accion = "";
        if(nombre.equals("")) {
            accion += "El nombre no puede estar vacío\n";
        }
        if(nombre.length() > 20) {
            accion += "El nombre no puede tener más de 20 caracteres\n";
        }
        if(apellidos.equals("")) {
            accion += "Los apellidos no pueden estar vacíos\n";
        }
        if (apellidos.length() > 30) {
            accion += "Los apellidos no pueden tener más de 30 caracteres\n";
        }
        if(direccion.equals("")) {
            accion += "La dirección no puede estar vacía\n";
        }
        if (direccion.length() > 40) {
            accion += "La dirección no puede tener más de 40 caracteres\n";
        }
        if(id.equals("")){
            accion += "El id no puede estar vacío para modificar el proveedor\n";
        }
        return accion;
    }

}

