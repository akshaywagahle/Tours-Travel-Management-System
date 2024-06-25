
package travel.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.sql.*;



public class Login extends JFrame implements ActionListener
{
    JButton login, signup, forgetPassword;
    
    JTextField tfUserName;
    
    JPasswordField tfPassword ;
    
    public Login()
    {
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(131, 193, 233));
        p1.setBounds(0, 0, 400, 400);
        p1.setLayout(null);
        add(p1);
        
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/user-login.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(100, 120, 200, 200);
        p1.add(image);
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(400, 30, 450, 300);
        add(p2);
        
        JLabel lblUserName = new JLabel("User Name");
        lblUserName.setBounds(60, 20 , 150, 25);
        lblUserName.setFont(new Font("SAN_SARIF", Font.PLAIN, 20));
        p2.add(lblUserName);
        
        tfUserName = new JTextField();
        tfUserName.setBounds(60, 60, 300,30);
        tfUserName.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfUserName);
        
        
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(60, 110 , 150, 25);
        lblPassword.setFont(new Font("SAN_SARIF", Font.PLAIN, 20));
        p2.add(lblPassword);
        
         tfPassword = new JPasswordField();
        tfPassword.setBounds(60, 150, 300,30);
        tfPassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfPassword);
        
        
         login = new JButton("LOGIN");
        login.setBounds(60, 200, 130, 30);
        login.setBackground( new Color(133, 193, 233));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(133, 193, 233)));
        login.addActionListener(this);
        p2.add(login);
        
        
         signup = new JButton("SIGN-UP");
        signup.setBounds(230, 200, 130, 30);
        signup.setBackground( new Color(133, 193, 233));
        signup.setForeground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(133, 193, 233)));
        signup.addActionListener(this);
        p2.add(signup);
        
        
         forgetPassword = new JButton("Forget Password");
        forgetPassword.setBounds(140, 250, 130, 30);
        forgetPassword.setBackground( new Color(133, 193, 233));
        forgetPassword.setForeground(Color.WHITE);
        forgetPassword.setBorder(new LineBorder(new Color(133, 193, 233)));
        forgetPassword.addActionListener(this);
        p2.add(forgetPassword);
        
        
        JLabel text = new JLabel("Troble in Login...");
        text.setBounds(300, 250, 150, 20);
        text.setForeground(Color.red);
        p2.add(text);
       
        setSize(900,400);
        setLocation(400, 200);
        getContentPane().setBackground(Color.WHITE);
        
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() ==  login)
        {
            try
            {
                String userName = tfUserName.getText();
                
                String password = tfPassword.getText();
                
                String query = "select * from account where userName = '"+userName+"' AND password = '"+password+"'  ";
                
                Conn conn = new Conn();
                
                ResultSet rs = conn.s.executeQuery(query);
                
                if(rs.next()) 
                {
                    setVisible(false);
                    new Loading(userName);
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "Invalid User-Name & Password Combination");
                }
                
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == signup)
        {
            setVisible(false);
            new SignUp();
        }
        else if(ae.getSource() == forgetPassword)
        {
            setVisible(false);
            new ForgetPassword();
        }
    }
    
    
    public static void main(String[] args) 
    {
         new Login();
        
    }
    
}
 