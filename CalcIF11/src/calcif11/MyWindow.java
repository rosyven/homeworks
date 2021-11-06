
package calcif11;

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
        String strA = txtA.getText();
        String strB = txtB.getText();
        double A = Double.parseDouble(strA);
        double B = Double.parseDouble(strB);
        if(A % 2 == 0 && B % 2 == 0 || A % 2 != 0 && B % 2 != 0)
        {
            lblMessage.setText("Утверждение верно");
        }else
        {
            lblMessage.setText("Утверждение неверно");
        }
    }
    
}
