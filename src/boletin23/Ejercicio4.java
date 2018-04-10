
package boletin23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Ejercicio4 implements ActionListener{
    JFrame marco1,marco2;
    JPanel panel,panel2;
    JButton bAbrirV;

    public Ejercicio4() {
         marco1=new JFrame("Ejercicio 4.1");
         marco2=new JFrame("Ejericio 4.2");
        panel=new JPanel();
        panel2=new JPanel();
        bAbrirV=new JButton("Abrir Ventana");
        marco1.setSize(400, 200);
        panel.add(bAbrirV);
        marco1.add(panel);
        marco2.setSize(400,200);
        marco2.add(panel2);
        
        bAbrirV.addActionListener(this);
         marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco1.setLocationRelativeTo(marco1);
        marco1.setVisible(true);

        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setLocationRelativeTo(marco2);
        marco2.setVisible(true);
    }

}
