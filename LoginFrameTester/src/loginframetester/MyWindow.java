
package loginframetester;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
public class MyWindow extends JFrame {
    JButton btnAction;
    JTextField txtField;
    JPasswordField password;
    
    public MyWindow()
    {
        setSize(300, 200);
        setTitle("Login in System");
        
        //txtField = new JTextField();
        //this.add(this.txtField, BorderLayout.NORTH);
        
        password = new JPasswordField();
        this.add(this.password, BorderLayout.NORTH);
        
        btnAction = new JButton("Login");
        this.add(this.btnAction, BorderLayout.SOUTH);
        
        //this.setLayout(new FlowLayout(FlowLayout.CENTER));
        
    }
}
