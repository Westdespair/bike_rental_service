package no.ntnu.bikerental.queries;

import no.ntnu.bikerental.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionQueries {
    Connection connection = DatabaseConnection.connect();
    Statement statement = connection.createStatement();

    /**
     * Contains queries for accessing important information regarding the transactions in the database.
     * @throws SQLException
     */
    public TransactionQueries() throws SQLException {
    }

    /**
     * Returns the total price of the entire transaction
     * @param transactionID The numerical ID of a given transaction
     * @return The total price of the transaction
     */
    public int getTransactionPrice(int transactionID) throws SQLException {
        return (getTotalPriceOfProducts(transactionID) + getTotalPriceOfRentals(transactionID));
    }

    /**
     * Returns the total price of all products in a given transaction
     * @param transactionID the ID of a given transaction to check for products
     * @return the total price of all products in the transaction
     * @throws SQLException if the database connectivity is broken
     */
    private int getTotalPriceOfProducts(int transactionID) throws SQLException {
        return statement.executeQuery("SELECT SUM(product_price) AS PRODUCTSUM "
                + "FROM Transactions "
                + "LEFT JOIN Orders "
                + "ON Transactions.transaction_ID = Orders.transaction_ID "
                + "LEFT JOIN Products "
                + "ON Orders.product_ID = Products.product_ID "
                + "WHERE transactions.transaction_ID = " + transactionID).getInt("PRODUCTSUM");
    }

    /**
     * Returns the cost of all rented bikes in a transaction
     * @param transactionID The ID of a given transaction
     * @return The total price of all rentals in a transaction
     * @throws SQLException if the database connectivity is broken
     */
    private int getTotalPriceOfRentals(int transactionID) throws SQLException {
        return statement.executeQuery(
        "SELECT SUM(ROUND((JULIANDAY(end_date) - JULIANDAY(start_date))* 24*60)) AS COSTSUM "
        + "FROM Transactions "
        + "LEFT JOIN Orders "
        + "ON Transactions.transaction_ID = Orders.transaction_ID "
        + "LEFT JOIN Bike_Rentals "
        + "ON Orders.rental_ID = Bike_Rentals.rental_ID "
        + "LEFT JOIN Bikes "
        + "ON Bike_Rentals.bike_ID = Bikes.bike_ID "
        + "LEFT JOIN Bike_Types "
        + "ON Bikes.bike_type_ID = Bike_Types.bike_type_ID "
        + "WHERE Transactions.transaction_ID = " + transactionID).getInt("COSTSUM");
    }
}
