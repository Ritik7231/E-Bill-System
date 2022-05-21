 
package electricity.billing.system;
 
import javax.swing.*;

public class Project extends JFrame{
    
    Project(){
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Project();
    }
}
