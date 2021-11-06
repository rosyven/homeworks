
package calcif1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class MyWindow extends JFrame implements ActionListener {

    JLabel lblMessage;
    JButton btnAction;
    JTextField txtField;
    
    public MyWindow()
            {
                setSize(400,200);
                setTitle("Положительное число");
                
                lblMessage = new JLabel("Введите число");
                this.add(this.lblMessage, BorderLayout.NORTH);
                txtField = new JTextField();
                this.add(this.txtField, BorderLayout.CENTER);
                btnAction = new JButton("Вывести");
                this.add(this.btnAction, BorderLayout.SOUTH);
                btnAction.addActionListener(this);
                
                
                
                
                
            }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String strA = txtField.getText();
        double A = Double.parseDouble(strA);
        //double S = MyMath.calcA(A);
        //String RESULT = String.valueOf(S);
        if (A < 0)
        {
            lblMessage.setText("Число отрицательное");
        }else
        {
            lblMessage.setText("Число положительное");
        }
        
}
}
