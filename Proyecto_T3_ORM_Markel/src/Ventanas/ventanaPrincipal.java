package Ventanas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaPrincipal extends JFrame {

    public JPanel contenedorPrincipal;
    private JButton Proveedores;
    private JButton Piezas;
    private JButton Proyectos;
    private JButton Gestion_Global;
    private JButton Ayuda;
    private JButton Cerrar;
   // private JLabel logoLabel;
   // private JLabel logo2;


    public ventanaPrincipal(){

        Proveedores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Menu_Proveedores proveedores = new Menu_Proveedores();
                proveedores.setVisible(true);

            }
        });
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("ventanaPrincipal");
        frame.setContentPane(new ventanaPrincipal().contenedorPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    /*
        logoLabel.setSize(400, 180);
        ImageIcon imagen = new ImageIcon("src/Imagenes/logo1.png");
        Icon icon = new ImageIcon(imagen.getImage().getScaledInstance(logoLabel.getWidth(), logoLabel.getHeight(), Image.SCALE_DEFAULT));
        logoLabel.setIcon(icon);

        logo2.setSize(149, 149);
        ImageIcon imagen2 = new ImageIcon("src/Imagenes/logo2.png");
        Icon icon2 = new ImageIcon(imagen2.getImage().getScaledInstance(logo2.getWidth(), logo2.getHeight(), Image.SCALE_DEFAULT));
        logo2.setIcon(icon2);
        */
}
