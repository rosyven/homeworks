
package calcif2.pkg3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
public class MyWindow extends JFrame implements ActionListener{
    JButton btnAction;
    JLabel lblMessage;
    JTextField txtField;
    
    public MyWindow()
    {
        setSize(400, 200);
        setTitle("Проверка четности");
        
        lblMessage = new JLabel("Введите число");
        this.add(this.lblMessage, BorderLayout.NORTH);
        
        txtField = new JTextField();
        this.add(this.txtField, BorderLayout.CENTER);
        
        btnAction = new JButton("Узнать");
        this.add(this.btnAction, BorderLayout.SOUTH);
        
        btnAction.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String strA = txtField.getText();
        double A = Double.parseDouble(strA);
        if (A % 2 == 0)
        {
            lblMessage.setText("Число четное");
        }else
        {
            lblMessage.setText("Число нечетное");
        }
    }
}
