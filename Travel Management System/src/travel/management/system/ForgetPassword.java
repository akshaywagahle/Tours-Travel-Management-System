
package travel.management.system;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;


public class ForgetPassword extends JFrame implements ActionListener
{
    JTextField tfUserName, tfName, tfQuestion , tfAnswer, tfPassword;
    
    JButton search, retrive, back;
    
    public ForgetPassword()
    {
        setBounds(350, 200, 850,380);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/forgot-password.jpg"));
        Image i2 = i1.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(550, 30, 300, 300);
        add(image);
        
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(40, 20, 500, 280);
        add(p1);
        
        JLabel lblUserName = new JLabel("USER Name");
        lblUserName.setBounds(40, 20 , 100, 25);
        lblUserName.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblUserName);
        
        tfUserName = new JTextField();
        tfUserName.setBounds(220, 20, 150, 25);
        tfUserName.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfUserName);
        
        search = new JButton("Search");
        search.setBackground(Color.gray);
        search.setForeground(Color.white);
        search.setBounds(380, 20, 100, 25);
        search.addActionListener(this);
        p1.add(search);
        
        
        JLabel lblName = new JLabel("Name");
        lblName.setBounds(40, 60 , 100, 25);
        lblName.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblName);
        
        tfName = new JTextField();
        tfName.setBounds(220, 60, 150, 25);
        tfName.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfName);
        
        JLabel lblQuestion = new JLabel("Security Question");
        lblQuestion.setBounds(40, 100 , 150, 25);
        lblQuestion.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblQuestion);
        
        tfQuestion = new JTextField();
        tfQuestion.setBounds(220, 100, 150, 25);
        tfQuestion.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfQuestion);
        
        JLabel lblAnswer = new JLabel("Answer");
        lblAnswer.setBounds(40, 140 , 100, 25);
        lblAnswer.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblAnswer);
        
        tfAnswer = new JTextField();
        tfAnswer.setBounds(220, 140, 150, 25);
        tfAnswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfAnswer);
        
        retrive = new JButton("Retrive");
        retrive.setBackground(Color.gray);
        retrive.setForeground(Color.white);
        retrive.setBounds(380, 140, 100, 25);
        retrive.addActionListener(this);
        p1.add(retrive);
        
        JLabel lblPassword = new JLabel("Password");
        lblPassword.setBounds(40, 180 , 100, 25);
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 14));
        p1.add(lblPassword);
        
        tfPassword = new JTextField();
        tfPassword.setBounds(220, 180, 150, 25);
        tfPassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfPassword);

        
        back = new JButton("BACK");
        back.setBackground(Color.gray);
        back.setForeground(Color.white);
        back.setBounds(150, 220, 100, 25);
        back.addActionListener(this);
        p1.add(back);
        
        
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == search)
        {
            try
            {
               String query = "select * from account where  userName = '"+tfUserName.getText()+"'"; 
               
               Conn conn = new Conn();
               
               ResultSet rs = conn.s.executeQuery(query);
               
               while(rs.next())
               {
                   tfName.setText(rs.getString("name"));
                   
                   tfQuestion.setText(rs.getString("security"));
               }
               
               
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == retrive)
        {
            String query = "select * from account where answer = '"+tfAnswer.getText()+"' AND  userName = '"+tfUserName.getText()+"' ";
 
            try
            {
                Conn conn = new Conn();
                
                ResultSet rs = conn.s.executeQuery(query);
                
                while(rs.next())
                {
                    tfPassword.setText(rs.getString("password"));
                }
                
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
        new ForgetPassword();
    }
    
}
