
package travel.management.system;

import java.sql.*;




public class Conn 
{
    Connection c;
    
    Statement s;
    
    public Conn()
    {
        try
        {
            //1. Register the Driver 
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //2.Creating Connection String
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem", "root", "Sher");
            
            //3.create statement 
            s = c.createStatement();
            
            //4.executing mysql queries
            
            
            //5. 
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        
    }
    
}
