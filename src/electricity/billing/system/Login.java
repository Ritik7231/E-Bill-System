 
package electricity.billing.system;
 
import java.awt.*;
import javax.swing.*;

public class Login extends JFrame{
    
    Login(){
        super("Login Page");
        getContentPane().setBackground(Color.WHITE); // changes whole frame color
        
        setSize(640,300);
        setLocation(400,200);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new Login();
    }
}
