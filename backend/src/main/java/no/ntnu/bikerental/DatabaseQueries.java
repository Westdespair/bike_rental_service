package no.ntnu.bikerental;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

public class DatabaseQueries {
    Connection connection = DatabaseConnection.connect();
    Statement statement = connection.createStatement();

    DatabaseQueries() throws SQLException {
    }

    /**
     * Returns a query for a search for a specific bike. User can specify which colour, type they want,
     * and whether they want a helmet.
     * @param colour which colour the requested bike should be.
     * @param type which type of bike the requested bike should be, usually eighties or electric.
     * @param requiresHelmet whether or not the user wants a helmet with the bike.
     * @throws SQLException
     */
    public void getSpecificAvailableBike(String colour, String type, boolean requiresHelmet) throws SQLException {
        String query = "SELECT * FROM Bikes \n" +
                "LEFT JOIN Bike_Rentals \n" +
                "ON Bike_Rentals.bike_ID = Bikes.bike_ID\n" +
                "LEFT JOIN Bike_Types \n" +
                "ON Bikes.bike_type_ID = Bike_Types.bike_type_ID";

                if(!colour.isBlank()) {
                    addConditionalIfNeeded(query,"colour = \"" + colour + "\"","AND");
                }

                if(!type.isBlank()) {
                    addConditionalIfNeeded(query, "bike_type_name = \"" + type + "\"","AND");
                }

                if(requiresHelmet) {
                    addConditionalIfNeeded(query, "bike_type_name = \"" + "true" + "\"","AND");
                }

                query += "AND start_date IS NULL " +
        "OR end_date < (SELECT strftime(" +"\'" + "%Y-%m-%d %H-%M" + "\'" +"," + "\'" + "now" + "\'))";
        statement.executeQuery(query);
    }

    /**
     * Returns a query for all bikes that are not currently rented out.
     * @throws SQLException
     */
    public void getAnyAvailableBike() throws SQLException {
        statement.executeQuery("SELECT * FROM Bikes \n" +
                "LEFT JOIN Bike_Rentals \n" +
                "on Bike_Rentals.bike_ID = Bikes.bike_ID\n" +
                "WHERE start_date IS NULL\n" +
                "OR end_date < (SELECT strftime('%Y-%m-%d %H-%M', 'now'))");
    }

    /**
     * Checks if a condition can be added to the back of a partial query, adds the condition if there is not one present.
     * @param addString
     * @return
     */
    public String addConditionalIfNeeded(String query, String addString, String conditional) {
        String lastWord = query.split(" ")[-1];
        if(lastWord.equalsIgnoreCase("where") || lastWord.equalsIgnoreCase("and") || lastWord.equalsIgnoreCase("or")) {
            query += addString;
        } else {
            query += conditional + addString;
        }
        return addString;
    }
}