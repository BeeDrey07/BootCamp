package book8.chapter4;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
    public static void main(String[] args) {
        Connection con = getConnection();
    }
    private static Connection getConnection()
    {
        Connection con = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/Movies";
            String user = "root";
            String pw = "Password";
            con = DriverManager.getConnection(url, user, pw);
        }
        catch (ClassNotFoundException e)
        {
            System.out.println(e);
            System.exit(0);
        }
        catch (SQLException e)
        {
            System.out.println(e);
            System.exit(0);
        }
        System.out.println("Successful Connection");
        return con;
    }
}
