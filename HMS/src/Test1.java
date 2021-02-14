import java.sql.*;
import javax.swing.JOptionPane;
public class Test1 {
public final String URL="jdbc:postgresql://localhost:5432/GHRCE";
public final String USER="postgres";
public final String PASSWORD="dbms";
public Connection connection()
{
    Connection conn = null;
    try
    {
        conn = DriverManager.getConnection(URL,USER,PASSWORD);
        JOptionPane.showMessageDialog(null,"CONNECTED TO DATABASE");
    }
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, e);
    }
    return conn;
}
    public static void main(String[] args) {
        Test1 obj = new Test1();
        obj.connection();
       
    }
}
