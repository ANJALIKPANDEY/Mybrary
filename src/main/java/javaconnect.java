
import java.sql.*;
import javax.swing.*;

public class javaconnect 
{
    static Connection con ;
    
    public static Connection ConnectDb()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarynew", "root", "");
            System.out.println(con);
            return con;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}