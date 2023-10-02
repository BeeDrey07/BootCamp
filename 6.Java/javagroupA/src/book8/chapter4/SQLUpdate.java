package book8.chapter4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


import static java.sql.DriverManager.getConnection;

public class SQLUpdate {
    private static Connection con;

    public static <Statement> void main(String[] args) {
        loanMovie(1, "Dreyer", "Bianca");
    }

    private static void loanMovie(int id, String lastName, String firstName) {
        con = getConnection();
        try {
            Statement stmt = con.createStatement();
            String insert = "insert into friend "
                    + "(lastname, firstname, movieid) "
                    + "values ("
                    + "\"" + lastName + "\", \""
                    + firstName + "\", " +
                    +id + ")";
            int result = stmt.executeUpdate(insert);
            if (result == 1) {
                System.out.println("FRIEND WAS ADDED SUCCESSFULLY");
            } else {
                System.out.println("FRIEND WAS NOT ADDED");
            }
            con.close();
        } catch (SQLException e) {
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
        }catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
            System.exit(0);
        }
        System.out.println("SUCCESSFUL CONNECTION");
        return con;
    }

}

