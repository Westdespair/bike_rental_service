package no.ntnu.bikerental;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;

/**
 * Method library for using queries from KRRR_database.
 */
public class DatabaseQueries {
    Connection connection = DatabaseConnection.connect();
    Statement statement = connection.createStatement();

    DatabaseQueries() throws SQLException {
    }

    /**
     * Returns a query for a search for a specific bike. User can specify which colour, type they want,
     * and whether they want a helmet.
     * TODO: Return one result, the one specific bike that has been available the longest.
     * @param colour which colour the requested bike should be.
     * @param type which type of bike the requested bike should be, usually eighties or electric.
     * @param requiresHelmet whether or not the user wants a helmet with the bike.
     * @throws SQLException
     */
    public void getSpecificAvailableBike(String colour, String type, boolean requiresHelmet) throws SQLException {
        String query = """
                SELECT * FROM Bikes\s
                LEFT JOIN Bike_Rentals\s
                ON Bike_Rentals.bike_ID = Bikes.bike_ID
                LEFT JOIN Bike_Types\s
                ON Bikes.bike_type_ID = Bike_Types.bike_type_ID""";

                //Adds conditions to the middle of the query if they need to be filled.
                if(!colour.isBlank()) {
                   query = addConditionalIfNeeded(query,"colour = \"" + colour + "\"","AND");
                }

                if(!type.isBlank()) {
                    query = addConditionalIfNeeded(query, "bike_type_name = \"" + type + "\"","AND");
                }

                if(requiresHelmet) {
                    query = addConditionalIfNeeded(query, "helmet_included = \"" + "true" + "\"","AND");
                }

                query += "AND start_date IS NULL " +
        "OR end_date < (SELECT strftime(" + "'" + "%Y-%m-%d %H-%M" + "'" +"," + "'" + "now" + "'))";
        statement.executeQuery(query);
    }

    /**
     * Returns a query for all bikes that are not currently rented out.
     * TODO: Return one result, the one available bike that has been available the longest.
     * @throws SQLException
     */
    public void getAnyAvailableBike() throws SQLException {
        statement.executeQuery("""
                SELECT * FROM Bikes\s
                LEFT JOIN Bike_Rentals\s
                on Bike_Rentals.bike_ID = Bikes.bike_ID
                WHERE start_date IS NULL
                OR end_date < (SELECT strftime('%Y-%m-%d %H-%M', 'now'))""");
    }

    /**
     * Checks if a condition can be added to the back of a partial query, adds the condition if there is not one present.
     * @param addString The string you want to add as a conditional.
     * @return The input string, with added conditionals if they are needed.
     */
    public String addConditionalIfNeeded(String query, String addString, String conditional) {
        String[] lastWordList = query.split(" ");
        String lastWord = lastWordList[lastWordList.length-1];
        if(lastWord.equalsIgnoreCase("where") || lastWord.equalsIgnoreCase("and") || lastWord.equalsIgnoreCase("or")) {
            query += addString;
        } else {
            query += conditional + addString;
        }
        return addString;
    }
}