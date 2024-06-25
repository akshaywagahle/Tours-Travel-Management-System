
package travel.management.system;
import javax.swing.*;
import java.awt.*;
public class AddCustomer extends JFrame
{
    JLabel lblUserName ;
    public AddCustomer()
    {
        setBounds(450, 200,850,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        JLabel lblUserName = new JLabel("UserName");
        lblUserName.setBounds(30,50,150,25);
        add(lblUserName);
        
        lblUserName = new JLabel("UserName");
        lblUserName.setBounds(30,50,150,25);
        add(lblUserName);
        
        setVisible(true);
    }
    
    
    
    public static void main(String[] args)
    {  
        new AddCustomer();
    }
}
