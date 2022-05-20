 
package electricity.billing.system;
 
import javax.swing.*;
import java.awt.*;

public class Signup extends JFrame{
    
    Signup(){
        
        super("SignUp Page");
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel i1 = new JLabel("Create Account As");
        i1.setBounds(100,20,150,20);
        add(i1);
        
        JLabel i2 = new JLabel("Username");
        i2.setBounds(100,80,150,20);
        add(i2);
        
        
        setSize(650,400);
        setLocation(300,150);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new Signup();
    }
}
