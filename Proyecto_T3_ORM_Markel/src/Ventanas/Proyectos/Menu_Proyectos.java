package Ventanas.Proyectos;

import Ventanas.Proveedores.Proveedores_Altas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_Proyectos extends JFrame{
    public JPanel Contenedor_Principal;
    private JButton altas_proyectos;
    private JButton bajas_proyectos;
    private JButton modificaciones_proyectos;
    private JButton listar_proyectos;
    private JButton atras_proyectos;
public Menu_Proyectos() {
    altas_proyectos.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Menu de altas");
            frame.setSize(750, 450);
            frame.setContentPane(new Proyectos_Altas().Contenedor_Principal);
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    });
    bajas_proyectos.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Menu de bajas");
            frame.setSize(750, 450);
            frame.setContentPane(new Proyectos_Bajas().Contenedor_Principal);
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    });
    modificaciones_proyectos.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Menu de modificar");
            frame.setSize(750, 450);
            frame.setContentPane(new Proyectos_Modificar().Contenedor_Principal);
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    });
    listar_proyectos.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Menu de busquedas");
            frame.setSize(750, 450);
            frame.setContentPane(new Proyectos_Mostrar().Contenedor_Principal);
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    });
    atras_proyectos.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}
}
