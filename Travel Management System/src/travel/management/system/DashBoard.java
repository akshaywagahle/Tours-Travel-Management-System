
package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DashBoard extends JFrame implements ActionListener
{
    String userName;
    
    JButton addPersonalDetails , updatePersonalDetails, viewPersonalDetails, deletePersonalDetails;
    JButton checkPackageas, bookPackage, viewPackage, viewHotels, bookHotel, viewBookedHotel;
    JButton destinations, payments, calculator, notePad, about;
    public DashBoard(String userName)
    {
        this.userName = userName;
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 102));
        p1.setBounds(0,0,1600,65);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2 = i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel icon = new JLabel(i3);
        icon.setBounds(5, 0, 70,70);
        p1.add(icon);
        
        JLabel heading = new JLabel("DASHBOARD");
        heading.setBounds(80,10, 300,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Tahoma", Font.BOLD,30));
        p1.add(heading);
        
        
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0, 100, 120));
        p2.setBounds(0,65,300,900);
        add(p2);
        
        
        addPersonalDetails = new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0, 0, 300,49);
        addPersonalDetails.setBackground(new Color(0, 100, 120));
        addPersonalDetails.setForeground(Color.white);
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);
        
        updatePersonalDetails = new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0, 49, 300,49);
        updatePersonalDetails.setBackground(new Color(0, 100, 120));
        updatePersonalDetails.setForeground(Color.white);
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);
        
        viewPersonalDetails = new JButton("View Details");
        viewPersonalDetails.setBounds(0, 109, 300,49);
        viewPersonalDetails.setBackground(new Color(0, 100, 120));
        viewPersonalDetails.setForeground(Color.white);
        viewPersonalDetails.setMargin(new Insets(0,0,0,130));
        viewPersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);
        
        deletePersonalDetails = new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0, 149, 300,49);
        deletePersonalDetails.setBackground(new Color(0, 100, 120));
        deletePersonalDetails.setForeground(Color.white);
        deletePersonalDetails.setMargin(new Insets(0,0,0,41));
        deletePersonalDetails.setFont(new Font("Tahoma", Font.PLAIN, 20));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);
        
        checkPackageas = new JButton("Check Packages");
        checkPackageas.setBounds(0, 199, 300,49);
        checkPackageas.setBackground(new Color(0, 100, 120));
        checkPackageas.setForeground(Color.white);
        checkPackageas.setMargin(new Insets(0,0,0,110));
        checkPackageas.setFont(new Font("Tahoma", Font.PLAIN, 20));
        checkPackageas.addActionListener(this);
        p2.add(checkPackageas);
        
        bookPackage = new JButton("Book Package");
        bookPackage.setBounds(0, 249, 300,49);
        bookPackage.setBackground(new Color(0, 100, 120));
        bookPackage.setForeground(Color.white);
        bookPackage.setMargin(new Insets(0,0,0,120));
        bookPackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookPackage.addActionListener(this);
        p2.add(bookPackage);
        
        viewPackage = new JButton("View Package");
        viewPackage.setBounds(0, 299, 300,49);
        viewPackage.setBackground(new Color(0, 100, 120));
        viewPackage.setForeground(Color.white);
        viewPackage.setMargin(new Insets(0,0,0,120));
        viewPackage.setFont(new Font("Tahoma", Font.PLAIN, 20));
        p2.add(viewPackage);
        
        viewHotels = new JButton("View Hotels");
        viewHotels.setBounds(0, 349, 300,49);
        viewHotels.setBackground(new Color(0, 100, 120));
        viewHotels.setForeground(Color.white);
        viewHotels.setMargin(new Insets(0,0,0,140));
        viewHotels.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewHotels.addActionListener(this);
        p2.add(viewHotels);
        
        bookHotel = new JButton("Book Hotel");
        bookHotel.setBounds(0, 399, 300,49);
        bookHotel.setBackground(new Color(0, 100, 120));
        bookHotel.setForeground(Color.white);
        bookHotel.setMargin(new Insets(0,0,0,150));
        bookHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        bookHotel.addActionListener(this);
        p2.add(bookHotel);
        
        viewBookedHotel = new JButton("View Booked Hotel");
        viewBookedHotel.setBounds(0, 449, 300,49);
        viewBookedHotel.setBackground(new Color(0, 100, 120));
        viewBookedHotel.setForeground(Color.white);
        viewBookedHotel.setMargin(new Insets(0,0,0,80));
        viewBookedHotel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        viewBookedHotel.addActionListener(this);
        p2.add(viewBookedHotel);
        
        destinations  = new JButton("Destinations");
        destinations.setBounds(0, 499, 300,49);
        destinations.setBackground(new Color(0, 100, 120));
        destinations.setForeground(Color.white);
        destinations.setMargin(new Insets(0,0,0,140));
        destinations.setFont(new Font("Tahoma", Font.PLAIN, 20));
        destinations.addActionListener(this);
        p2.add(destinations);
        
        payments = new JButton("Payments");
        payments.setBounds(0, 549, 300,49);
        payments.setBackground(new Color(0, 100, 120));
        payments.setForeground(Color.white);
        payments.setMargin(new Insets(0,0,0,160));
        payments.setFont(new Font("Tahoma", Font.PLAIN, 20));
        payments.addActionListener(this);
        p2.add(payments);
        
        calculator = new JButton("Calculator");
        calculator.setBounds(0, 599, 300,49);
        calculator.setBackground(new Color(0, 100, 120));
        calculator.setForeground(Color.white);
        calculator.setMargin(new Insets(0,0,0,155));
        calculator.setFont(new Font("Tahoma", Font.PLAIN, 20));
        calculator.addActionListener(this);
        p2.add(calculator);
        
        notePad = new JButton("Notepad");
        notePad.setBounds(0, 649, 300,49);
        notePad.setBackground(new Color(0, 100, 120));
        notePad.setForeground(Color.white);
        notePad.setMargin(new Insets(0,0,0,170));
        notePad.setFont(new Font("Tahoma", Font.PLAIN, 20));
        notePad.addActionListener(this);
        p2.add(notePad);
        
        about = new JButton("About");
        about.setBounds(0, 699, 300,49);
        about.setBackground(new Color(0, 100, 120));
        about.setForeground(Color.white);
        about.setMargin(new Insets(0,0,0,175));
        about.setFont(new Font("Tahoma", Font.PLAIN, 20));
        about.addActionListener(this);
        p2.add(about);
        
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1650,1000,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image = new JLabel(i6);
        image.setBounds(0,0,1650,1000);
        add(image);
        
        
        JLabel text = new JLabel("Travel And Tourist Management System");
        text.setBounds(400, 100, 1000, 70 );
        text.setForeground(Color.white);
        text.setFont(new Font("Raleway", Font.PLAIN, 55));
        image.add(text);
        
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == addPersonalDetails)
        {
            
        }
        else if(ae.getSource() == updatePersonalDetails)
        {
            
        }
        else if(ae.getSource() == viewPersonalDetails)
        {
            
        }
        else if(ae.getSource() == deletePersonalDetails)
        {
            
        }
        else if(ae.getSource() == checkPackageas)
        {
            
        }
        else if(ae.getSource() == bookPackage)
        {
            
        }
        else if(ae.getSource() == viewPackage)
        {
            
        }
        else if(ae.getSource() == viewHotels)
        {
            
        }
        else if(ae.getSource() == bookHotel)
        {
            
        }
        else if(ae.getSource() == viewBookedHotel)
        {
            
        }
        else if(ae.getSource() == destinations)
        {
            
        }
        else if(ae.getSource() == payments)
        {
            
        }
        else if(ae.getSource() == calculator)
        {
            
        }
        
        else if(ae.getSource() == notePad)
        {
            
        }
        else if(ae.getSource() == about)
        {
            
        }
        else
        {
            
        } 
  
    }
    
    
    public static void main(String[] args) 
    {
        new DashBoard(null);
        
    }
    
}
