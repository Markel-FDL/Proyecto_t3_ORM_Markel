package Ventanas;

import Ventanas.Gestion.Menu_Gestion_Global;
import Ventanas.Piezas.Menu_Piezas;
import Ventanas.Proveedores.Menu_Proveedores;
import Ventanas.Proyectos.Menu_Proyectos;

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
            public void actionPerformed(ActionEvent e) {Ir_proveedores();}
        });

        Piezas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ir_Piezas();
            }
        });

        Proyectos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ir_Proyectos();
            }
        });

        Gestion_Global.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ir_Gestion();
            }
        });

        Cerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public void Ir_proveedores(){
        JFrame frame = new JFrame("Menu de proveedores");
        frame.setSize(750, 450);
        frame.setContentPane(new Menu_Proveedores().Contenedor_Principal);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void Ir_Piezas() {
        JFrame frame = new JFrame("Menu de piezas");
        frame.setSize(750, 450);
        frame.setContentPane(new Menu_Piezas().Contenedor_Principal);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void Ir_Proyectos() {
        JFrame frame = new JFrame("Menu de proyectos");
        frame.setSize(750, 450);
        frame.setContentPane(new Menu_Proyectos().Contenedor_Principal);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void Ir_Gestion() {
        JFrame frame = new JFrame("Menu de gestion");
        frame.setSize(750, 450);
        frame.setContentPane(new Menu_Gestion_Global().Contenedor_Principal);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



 /*   public void Ir_proveedores2() {
        Menu_Proveedores frame = new Menu_Proveedores();
        frame.setSize(750, 450);
        contenedorPrincipal.removeAll();
        contenedorPrincipal.add(frame.Contenedor_Principal, BorderLayout.CENTER);
        contenedorPrincipal.revalidate();
        contenedorPrincipal.repaint();
    }*/

    public static void main(String[] args) {
        JFrame frame = new JFrame("ventanaPrincipal");
        frame.setSize(750, 450);
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
