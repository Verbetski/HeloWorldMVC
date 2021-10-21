package edu.verbetskiy.helloWorld;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test1 {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1521:XE", "admin", "admin")) {
            if (connection != null) {
                System.out.println("Connected to database!");
            } else {
                System.out.println("Failed to make connection!");
            }
        }
        catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        }
    }
}
