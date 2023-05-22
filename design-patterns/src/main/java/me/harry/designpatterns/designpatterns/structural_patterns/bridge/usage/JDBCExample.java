package me.harry.designpatterns.designpatterns.structural_patterns.bridge.usage;

import java.sql.*;

public class JDBCExample {

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver");

        try(Connection conn = DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "")) {
            String sql = "SELECT * FROM DUAL";

            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            if (stmt != null) stmt.close();;
            if( rs != null) rs.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
