package boletin23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Ejercicio3 implements ActionListener{
    JFrame marco;
    JPanel panel;
    JButton bSaudo,bDespedida;
    JTextField mostrar;
    
    public Ejercicio3() {
        marco=new JFrame("Ejercicio 3");
        panel=new JPanel();
        bSaudo=new JButton("Saudo");
        bDespedida=new JButton("Despedida");
        mostrar=new JTextField();
        marco.setSize(400, 200);
        panel.add(bSaudo);
        panel.add(bDespedida);
        panel.add(mostrar);
        marco.add(panel);
        bSaudo.addActionListener(this);
        bDespedida.addActionListener(this);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object boton=e.getSource();
        if(boton==bSaudo){
           mostrar.setText("Un saudo a DAM");
         }else{
           mostrar.setText("Fin do Programa");
         }
        }
    
    
}
