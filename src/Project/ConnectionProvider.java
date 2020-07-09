

package Project;

import java.sql.*;



/**
 *
 * @author DELL
 */
public class ConnectionProvider {
    public static Connection getCOn()
    {
        try
        {
          Class.forName("com.mysql.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://local host:3306/login","root","chakravarthy"); 
          return con;
        }
        catch(Exception e)
        {
          return null;
        }
    }

}