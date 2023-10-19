package chapter15;

import java.sql.*;
import java.util.HashMap;

public class ResultSetTest {
    public static void main(String[] args)  {
        String sql1 = "SELECT id, name FROM exhibits";
        var idToNameMap = new HashMap<Integer, String>();
        String url = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(url);
             PreparedStatement ps = conn.prepareStatement(sql1);
             ResultSet rs = ps.executeQuery()) {
            System.out.println(conn);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                idToNameMap.put(id, name);
            }
                System.out.println(idToNameMap);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
