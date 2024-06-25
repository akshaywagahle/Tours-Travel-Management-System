
package travel.management.system;

/**
 *PROJECT NAME :- Travel Management System 
 * STARTING DATE :- 15 FEB' 2024
 * TOTAL MODULE 1 
 * LAST MODIFICATION - 15 FEB 2024
 * @author prash
 */

import javax.swing.*;
import java.awt.*;
//import java.io.*;

public class Splash extends JFrame implements Runnable
{
    Thread thread ;

    public Splash()
    {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1200, 600,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        //setSize(1200, 600);
        //setLocation(200, 100);
        setVisible(true);
        
        thread = new Thread(this);
        thread.start();
        
    }    

    @Override
    public void run()
    {
        try
        {
           Thread.sleep(5000);
           //new Login();
           setVisible(false);
           new Login();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) 
    {
     
        Splash frame = new Splash();
        
        int x = 1;
        for(int i = 1 ; i < 500; x+= 7, i+=6)
        {
            frame.setSize(i+x , i);
            frame.setLocation(750-(x+i)/2, 400-(i/2));
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        
        
    }
    
}
