package book8.chapter4;

import java.sql.*;

public class UpdatableRowSet {

    private static Connection con;

    public static void main(String[] args) {
        con = getConnection();
        try {
            Statement stmt = con.createStatement(
                    ResultSet.TYPE_SCROLL_SENSITIVE,
                    ResultSet.CONCUR_UPDATABLE
            );
            ResultSet rs = stmt.executeQuery("select * from movie");
//            rs.absolute(9);
//            rs.deleteRow();
//            System.out.println("DELETED!");
//            rs.absolute(6);
//            rs.updateInt("year", 1975);
//            rs.updateRow();
//            System.out.println("UPDATED");

//            rs.moveToInsertRow();
//            rs.updateString("Title", "Harry Potter");
//            rs.updateInt("year", 1700);
//            rs.updateDouble("price", 100.00);
//            rs.insertRow();
//            rs.moveToCurrentRow();
//            System.out.println("ROW INSERTED");
//            con.close();

        } catch (Exception e) {
            System.out.println(e);
            System.exit(0);
        }
    }

    private static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/movies";
            String user = "root";
            String pw = "Password";
            con = DriverManager.getConnection(url, user, pw);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
            System.exit(0);
        }
        System.out.println("SUCCESSFUL CONNECTION");
        return con;
    }
}
