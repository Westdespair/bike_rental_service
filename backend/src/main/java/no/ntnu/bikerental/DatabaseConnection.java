package no.ntnu.bikerental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Connects the SQLite database to the Springboot backend.
 */
public class DatabaseConnection {
    public static Connection connect() {
        Connection connection = null;
        try {
            Class.forName("org.sqlite.JDBC");
            //Connects with the Keep Rolling Rolling Rolling database file in resources.
            connection = DriverManager.getConnection("jdbc:sqlite:backend/src/main/resources/KRRR_database.db");
            System.out.println("Connection success!");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            System.out.println("Connection to database failed.");
        }
        return connection;
    }
}