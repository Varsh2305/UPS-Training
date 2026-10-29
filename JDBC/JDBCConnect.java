package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnect {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "Varsh@1305";

        String insertQuery =
            "INSERT INTO student (id, name, department) VALUES (?, ?, ?)";

        String selectQuery = "SELECT * FROM student";

        try (Connection con =
                 DriverManager.getConnection(url, username, password)) {

            System.out.println("MySQL connection successful!");

            try (PreparedStatement ps = con.prepareStatement(insertQuery)) {
                ps.setInt(1, 4);
                ps.setString(2, "Rahul");
                ps.setString(3, "CSE");

                int rows = ps.executeUpdate();
                System.out.println(rows + " record inserted successfully.");
            }

            try (ResultSet rs = con.createStatement()
                                   .executeQuery(selectQuery)) {

                System.out.println("\nStudent Records:");

                while (rs.next()) {
                    System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("department")
                    );
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}