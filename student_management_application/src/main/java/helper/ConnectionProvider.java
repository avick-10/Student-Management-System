
package helper;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider 
{
    private static Connection con=null;
    
    public static Connection getConnection()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String username="root";
            String pwd="sreyashi";
            String url="jdbc:mysql://localhost:3306/SMA";
            
            con = DriverManager.getConnection(url, username, pwd);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
