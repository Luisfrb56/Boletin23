
package boletin23;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



public class Ejercicio4_2 implements ActionListener {
    JFrame marco;
    JPanel panel;
    JButton bDebux,bLimpa;
    JTextField mostra;
    
    public Ejercicio4_2() {
        marco=new JFrame("Ejercicio 3");
        panel=new JPanel();
        bDebux=new JButton("Debuxa");
        bLimpa=new JButton("Limpa");
        mostra=new JTextField(0);
        marco.setSize(400, 200);
        panel.add(bDebux);
        panel.add(bLimpa);
        panel.add(mostra);
        marco.add(panel);
        bDebux.addActionListener(this);
        bLimpa.addActionListener(this);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
    }
        @Override
    public void actionPerformed(ActionEvent e) {
        Object boton=e.getSource();
        if(boton==bDebux){
            
        }
        }
}

