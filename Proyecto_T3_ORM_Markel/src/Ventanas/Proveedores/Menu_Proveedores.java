package Ventanas.Proveedores;

import Ventanas.Proyectos.Menu_Proyectos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_Proveedores extends JFrame{
    public JPanel Contenedor_Principal;
    private JButton atras_proveedores;
    private JButton listar_proveedores;
    private JButton modificaciones_proveedores;
    private JButton bajas_proveedores;
    private JButton altas_proveedores;

    public Menu_Proveedores() {
        altas_proveedores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Menu de altas");
                frame.setSize(750, 450);
                frame.setContentPane(new Proveedores_Altas().Contenedor_Principal);
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        atras_proveedores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        bajas_proveedores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Menu de bajas");
                frame.setSize(750, 450);
                frame.setContentPane(new Proveedores_Bajas().panel1);
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        modificaciones_proveedores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Menu de modificacion");
                frame.setSize(750, 450);
                frame.setContentPane(new Proveedores_Modificar().Contenedor_Principal);
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
        listar_proveedores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("Menu de busquedas");
                frame.setSize(750, 450);
                frame.setContentPane(new Proveedores_Mostrar().Contenedor_Principal);
                frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}


