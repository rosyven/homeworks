
package calcif4;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
public class MyWindow extends JFrame implements ActionListener {
    
    JButton btnAction;
    JLabel lblMessage;
    JTextField txtA;
    JTextField txtB;
    JPanel panel;
    
    public MyWindow()
    {
        setSize(400, 200);
        setTitle("Неравенства");
        
        lblMessage = new JLabel("Введите числа");
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
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        String strA = txtA.getText();
        String strB = txtB.getText();
        double A = Double.parseDouble(strA);
        double B = Double.parseDouble(strB);
        
        if(A > 2 && B <= 3)
        {
            lblMessage.setText("Неравенство (А > 2 & B <= 3) правильно");
        }else
        {
            lblMessage.setText("Неравенство (А > 2 & B <= 3) неправильно");
        }
    }
    
}
