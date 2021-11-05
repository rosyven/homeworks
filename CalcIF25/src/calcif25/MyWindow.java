/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcif25;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class MyWindow extends JFrame implements ActionListener{
    JButton btnAction;
    JLabel lblMessage;
    JPanel panel;
    JTextField txtA;
    JTextField txtB;
    JTextField txtC;
    public MyWindow()
    {
        setSize(400, 200);
        setTitle("Proverka");
        
        lblMessage = new JLabel("Введите в первое поле х, а во второе у");
        this.add(this.lblMessage, BorderLayout.NORTH);
        
        panel = new JPanel();
        this.add(this.panel, BorderLayout.CENTER);
        
        txtA = new JTextField();
        txtB = new JTextField();
        panel.setLayout(new BorderLayout());
        panel.add(txtA, BorderLayout.NORTH);
        panel.add(txtB, BorderLayout.CENTER);
        
        btnAction = new JButton("Узнать");
        this.add(this.btnAction, BorderLayout.SOUTH);
        btnAction.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String strA = txtA.getText();
        String strB = txtB.getText();
        double A = Double.parseDouble(strA);
        double B = Double.parseDouble(strB);
        
        if(A < 0 && B > 0)
        {
            lblMessage.setText("Точка лежит во второй координатной четверти" );
        }else
        {
            lblMessage.setText("Точка не лежит во второй координатной четверти");
        }
    }
    
}
