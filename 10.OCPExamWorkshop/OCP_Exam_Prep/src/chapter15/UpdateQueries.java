package chapter15;

import java.sql.*;

public class UpdateQueries {
    static Connection conn2;

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:hsqldb:file:zoo";
        try (Connection conn = DriverManager.getConnection(url)) {
            conn2 = conn;
            var insertSql = "INSERT INTO exhibits VALUES(10, 'Deer', 3)";
            var updateSql = "UPDATE exhibits SET name = '' " +
                    "WHERE name = 'None'";
            var deleteSql = "DELETE FROM exhibits WHERE id = 10";
            var updateSql2 = "UPDATE names SET name = 'Josie' " +
                    "WHERE name = 'Eddie'";
            var readSql = "SELECT * FROM names";
//
//            try (var ps = conn.prepareStatement(insertSql)) {
//                int result = ps.executeUpdate();
//                System.out.println(result); // 1
//            }
//
//            try (var ps = conn.prepareStatement(updateSql)) {
//                int result = ps.executeUpdate();
//                System.out.println(result); // 0
//            }

//            try (var ps = conn.prepareStatement(updateSql2)) {
//                int result = ps.executeUpdate();
//                System.out.println(result); // 0
//            }
//
//            try (var ps = conn.prepareStatement(deleteSql)) {
//                int result = ps.executeUpdate();
//                System.out.println(result); // 1
//            }
//            var sql = "SELECT * FROM exhibits";
//            try (var ps = conn.prepareStatement(sql);
//                 ResultSet rs = ps.executeQuery()) {
//
//                // work with rs
//
//
//                var sql2 = "SELECT * FROM names";
//                try (var ps2 = conn.prepareStatement(sql2)) {
//                    var result = ps2.executeQuery();
//                    while (result.next()) {
//                        System.out.println(result.getString(3));

            try {

                getResults(insertSql);
                getResults(updateSql);
                getResults(deleteSql);
                register(conn2, 6, 2, "Zoe");
                getResults(readSql);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
//                }
//            }
//        }
    }

    public static void getResults(String s) throws Exception {
        try (var ps = conn2.prepareStatement(s)) {
            boolean isRs = ps.execute();
            if (isRs) {
                try (ResultSet rs = ps.getResultSet()) {
                    System.out.println("Ran a query");
                    while (rs.next())
                        System.out.println(rs.getString(3));
                }
            } else {
                int result = ps.getUpdateCount();
                System.out.println("Ran an update");
                System.out.println("number of rows affected " + result);
            }
        }

    }

    public static void register(Connection conn, int key, int type, String name) throws SQLException {

        String sql = "INSERT INTO names VALUES(?, ?, ?)";

        try (PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, key);
            ps.setString(3, name);
            ps.setInt(2, type);
            ps.executeUpdate();
        }
    }
}


