package boletin23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio2 implements ActionListener{
    
    JFrame marco;
    JPanel panel;
    JButton bProg,bBases;

    public Ejercicio2() {
        marco=new JFrame("CURSO DAM");
        panel=new JPanel();
        bProg=new JButton("Programacion");
        bBases=new JButton("Bases");
        
        marco.setSize(400, 200);
        panel.add(bProg);
        panel.add(bBases);
        marco.add(panel);
        bProg.addActionListener(this);
        bBases.addActionListener(this);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         Object boton=e.getSource();
         if(boton==bProg){
             marco.setTitle("Programacion");
         }else{
             marco.setTitle("Bases de Datos");
         }
    }
    
}
