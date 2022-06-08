package no.ntnu.bikerental.queries;

import no.ntnu.bikerental.DatabaseConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductQueries {
    Connection connection = DatabaseConnection.connect();
    Statement statement = connection.createStatement();

    public ProductQueries() throws SQLException {
    }

    /**
     * Gets all the products from the products table.
     * @return A set of all results.
     * @throws SQLException If the database can't connect to the backend.
     */
    public ResultSet getAllProducts() throws SQLException {
        return statement.executeQuery(
                "SELECT * FROM Products"
        );
    }
}
