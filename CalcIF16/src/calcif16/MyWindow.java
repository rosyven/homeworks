
package calcif16;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
public class MyWindow extends JFrame implements ActionListener {
    JButton btnAction;
    JLabel lblMessage;
    JTextField txtField;
    public MyWindow()
    {
        setSize(400, 200);
        setTitle("Proverka");
        
        lblMessage = new JLabel("Введите целое положительное числo");
        this.add(this.lblMessage, BorderLayout.NORTH);
        
        txtField = new JTextField();
        this.add(this.txtField, BorderLayout.CENTER);
        
        btnAction = new JButton("Узнать");
        this.add(this.btnAction, BorderLayout.SOUTH);
        btnAction.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String strA = txtField.getText();
        double A = Double.parseDouble(strA);
        if (A % 2 == 0 && A >= 10 && A <= 99)
        {
            lblMessage.setText("Утверждение верно");
        }
        else
        {
            lblMessage.setText("Утверждение неверно");
        }
    }
}
