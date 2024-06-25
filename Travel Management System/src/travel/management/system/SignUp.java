
package travel.management.system;

import java.awt.*;
import javax.print.attribute.standard.ReferenceUriSchemesSupported;
import javax.swing.*;
import java.awt.event.*;


public class SignUp extends JFrame implements ActionListener
{
    JButton back , create;
    
    JTextField tfName , tfUserName, tfPassword, tfAnswer;
    
    Choice security;
    
    public SignUp()
    {
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(133, 193, 233));
        p1.setBounds(0,0,500, 400);
        p1.setLayout(null);
        add(p1);
        
        JLabel lblUserName = new JLabel("User Name");
        lblUserName.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblUserName.setBounds(50,20,125,25);
        p1.add(lblUserName);
        
         tfUserName = new JTextField();
        tfUserName.setBounds(190, 20, 180, 25);
        tfUserName.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfUserName);
        
        
        JLabel lblname = new JLabel("Name");
        lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblname.setBounds(50,60,125,25);
        p1.add(lblname);
        
         tfName = new JTextField();
        tfName.setBounds(190, 60, 180, 25);
        tfName.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfName);
        
        
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblPassword.setBounds(50,100,125,25);
        p1.add(lblPassword);
        
       tfPassword = new JTextField();
        tfPassword.setBounds(190, 100, 180, 25);
        tfPassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfPassword);
        
        JLabel lblSecurity = new JLabel("Security Question");
        lblSecurity.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblSecurity.setBounds(50,140,140,25);
        p1.add(lblSecurity);
        
         security = new Choice();
        security.add("Fevorite character From The Boys");
        security.add("Fevorite Marvel Super Hero");
        security.add("Your Luckey Number");
        security.add("Your Childhoodf Super Hero");
        security.setBounds(190, 140, 180, 25);
        p1.add(security);
        
        
        JLabel lblAnswer = new JLabel("Answer");
        lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 14));
        lblAnswer.setBounds(50,180,125,25);
        p1.add(lblAnswer);
        
       tfAnswer = new JTextField();
        tfAnswer.setBounds(190, 180, 180, 25);
        tfAnswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfAnswer);
        
        create = new JButton("CREATE");
        create.setBackground(Color.WHITE);
        create.setForeground( new Color(133,193,233));
        create.setFont(new Font("Tahoma", Font.BOLD,14));
        create.setBounds(80, 250, 100, 30);
        create.addActionListener(this);
        p1.add(create);
        
        
        back = new JButton("BACK");
        back.setBackground(Color.WHITE);
        back.setForeground( new Color(133,193,233));
        back.setFont(new Font("Tahoma", Font.BOLD,14));
        back.setBounds(250, 250, 100, 30);
        back.addActionListener(this);
        p1.add(back);
        
        
        JPanel p2 = new JPanel();
        p2.setBackground(new Color(131, 193, 233));
        p2.setBounds(0, 0, 400, 400);
        p2.setLayout(null);
        add(p2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/sign-up.png"));
        Image i2 = i1.getImage().getScaledInstance(350, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(500, 30, 350, 300);
        add(image);
        
        setBounds(350, 200, 900, 360);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == create)
        {
            String userName = tfUserName.getText();
            
            String name = tfName.getText();
            
            String password = tfPassword.getText();
            
            String question = security.getSelectedItem();
            
            String answer = tfAnswer.getText();
            
            String query = "insert into account values('"+userName+"', '"+name+"' , '"+password+"' , '"+question+"' , '"+answer+"')";
            
            
            try
            {
                Conn conn = new Conn();
                
                //4. Executing MySql Query jdbc 4th step 
                
                conn.s.executeUpdate(query);
                
                //to show the pop message after the successful signup
                
                JOptionPane.showMessageDialog(null, "Account created Successfully");
                
                setVisible(false);
                new Login();
                
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
            
        }
        else if(ae.getSource() == back)
        {
            setVisible(false);
            new Login(); 
        }
    }
    
    
    public static void main(String[] args) 
    {
        new SignUp();
        
        
    }
    
}
