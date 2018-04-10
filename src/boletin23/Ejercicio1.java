
package boletin23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Ejercicio1 implements ActionListener {
    JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel premer;
    public Ejercicio1() {
        marco=new JFrame("Ejericio 1");
        panel=new JPanel();
        boton=new JButton("Boton");
        premer=new JLabel();
        marco.setSize(400, 200);
        panel.add(boton);
        panel.add(premer);
        marco.add(panel);
        boton.addActionListener(this);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       premer.setText("Premeches o boton");
    }
    
}
