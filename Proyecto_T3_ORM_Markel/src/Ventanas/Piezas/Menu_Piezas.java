package Ventanas.Piezas;

import Ventanas.Proveedores.Menu_Proveedores;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_Piezas extends JFrame{
    public JPanel Contenedor_Principal;
    private JButton altas_piezas;
    private JButton bajas_piezas;
    private JButton modificaciones_piezas;
    private JButton listado_piezas;
    private JButton atras_piezas;
public Menu_Piezas() {
    altas_piezas.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Menu de altas");
            frame.setSize(750, 450);
            frame.setContentPane(new Piezas_Altas().Contenedor_Principal);
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    });
    bajas_piezas.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Menu de bajas");
            frame.setSize(750, 450);
            frame.setContentPane(new Piezas_Bajas().Contenedor_Principal);
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    });
    modificaciones_piezas.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Menu de modificacion");
            frame.setSize(750, 450);
            frame.setContentPane(new Piezas_Modificar().Contenedor_Principal);
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    });
    listado_piezas.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFrame frame = new JFrame("Menu de busqueda");
            frame.setSize(750, 450);
            frame.setContentPane(new Piezas_Mostrar().Contenedor_Principal);
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
    });
    atras_piezas.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

        }
    });
}
}
