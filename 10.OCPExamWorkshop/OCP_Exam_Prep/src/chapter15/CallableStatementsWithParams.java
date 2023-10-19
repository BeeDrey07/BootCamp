package chapter15;

import java.sql.*;

public class CallableStatementsWithParams {
    public static void main(String[] args) {
        var sql = "{call read_names_by_letter(?)}";
        String url = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(url);
             var cs = conn.prepareCall(sql)) {
            cs.setString("prefix", "Z");

            try (var rs = cs.executeQuery()) {
                while (rs.next()) {
                    System.out.println(rs.getString(3));
                }
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
