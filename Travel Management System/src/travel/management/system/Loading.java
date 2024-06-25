
package travel.management.system;

import java.awt.Color;
 import javax.swing.*;
import java.awt.*;

public class Loading extends JFrame implements Runnable
{
    Thread t;
    JProgressBar bar;
    String userName;
    
    public Loading(String userName)
    {
        this.userName = userName;
        
        t = new Thread(this);
       
        setBounds(500,200, 650, 400);
        getContentPane().setBackground(Color.white);
        setLayout(null);
        
        JLabel text = new JLabel("Travel and Turist Application");
        text.setBounds(50,20 ,600, 40);
        text.setForeground(Color.blue);
        text.setFont(new Font("Raleway", Font.BOLD, 35));
        add(text);
        
         bar = new JProgressBar();
        bar.setBounds(150, 100,300,35);
        bar.setStringPainted(true);
        add(bar);
        
        JLabel loading = new JLabel("Loading, Please Wait...");
        loading.setBounds(230,130 ,500, 30);
        loading.setForeground(Color.red);
        loading.setFont(new Font("Raleway", Font.BOLD, 16));
        add(loading);
        
        JLabel username = new JLabel("Welcome "+userName);
        username.setBounds(20,310 ,500, 40);
        username.setForeground(Color.red);
        username.setFont(new Font("Raleway", Font.BOLD, 16));
        add(username);
    
        t.start();
        setVisible(true);
                
    }
    
    @Override
    public void run()
    {
        try
        {
            for(int i = 1 ; i <= 101; i++)
            {
                int max = bar.getMaximum(); //100
                int value = bar.getValue();
                
                if(value < max)
                {
                    bar.setValue(bar.getValue() + 1);
                }
                else
                {
                    setVisible(false);
                    
                    new DashBoard(userName);
                }
                Thread.sleep(105-i);
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    
    public static void main(String[] args) 
    {
        new Loading(null);
        
    }
    
}
