package chapter15;

import java.sql.*;

public class CallableStatements {
    public static void main(String[] args) {
        String sql = "{call read_e_names()}";
        String url = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(url);
             CallableStatement cs = conn.prepareCall(sql);
             ResultSet rs = cs.executeQuery()) {

            while (rs.next()) {
                System.out.println(rs.getString(3));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
