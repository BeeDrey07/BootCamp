package chapter15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class CallableStatementsWithReturnOut {
    public static void main(String[] args) {
         var sql = "{?= call magic_number(?) }";
        String url = "jdbc:hsqldb:file:zoo";
         try (Connection conn = DriverManager.getConnection(url);
              var cs = conn.prepareCall(sql)) {
             cs.registerOutParameter(1, Types.INTEGER);
              cs.execute();
              System.out.println(cs.getInt("num"));
              } catch (SQLException e) {
             System.out.println(e);
         }
    }
}
