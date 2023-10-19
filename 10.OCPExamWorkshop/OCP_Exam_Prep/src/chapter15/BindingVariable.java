package chapter15;

import java.sql.*;

public class BindingVariable {
    public static void main(String[] args) {
        var sql = "SELECT id, name FROM exhibits WHERE name = ?";
//        var sql1 = "SELECT count(*) FROM exhibits";
        String url = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(url);
             var ps = conn.prepareStatement(sql)) {
            ps.setString(1, "Zebra");
            var rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println(id + " : " + name);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
