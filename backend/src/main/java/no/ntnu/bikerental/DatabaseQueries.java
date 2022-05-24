package no.ntnu.bikerental;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
     * @param colour which colour the requested bike should be.
     * @param type which type of bike the requested bike should be, usually eighties or electric.
     * @param requiresHelmet whether or not the user wants a helmet with the bike.
     * @throws SQLException
     */
    public ResultSet getSpecificAvailableBike(String colour, String type, boolean requiresHelmet) throws SQLException {
        System.out.println("Specific bike find: ");
        String query = """
                SELECT * FROM Bikes\s
                LEFT JOIN Bike_Rentals\s
                ON Bike_Rentals.bike_ID = Bikes.bike_ID
                LEFT JOIN Bike_Types\s
                ON Bikes.bike_type_ID = Bike_Types.bike_type_ID
                 WHERE 
                """;

                //Adds conditions to the middle of the query if they need to be filled.
                if(!colour.isBlank()) {
                   query += addConditionalIfNeeded(query,"colour = \"" + colour + "\" ","AND ");
                }

                if(!type.isBlank()) {
                    query += addConditionalIfNeeded(query, "bike_type_name = \"" + type + "\" ","AND ");
                }

                if(requiresHelmet) {
                    query += addConditionalIfNeeded(query, "helmet_included = " + "true ","AND ");
                }

                query += addConditionalIfNeeded(query, "start_date IS NULL ", "AND ") +
                        """
                        OR end_date < (SELECT strftime('%Y-%m-%d %H-%M', 'now'))
                        ORDER BY end_date DESC
                        LIMIT 1
                        """;
                System.out.println(query);
       return statement.executeQuery(query);
    }

    /**
     * Returns any available bike if it exists.
     * @throws SQLException
     */
    public String getAnyAvailableBike() throws SQLException {
        ResultSet anyAvailableBike = statement.executeQuery("""
                SELECT * FROM Bikes\s
                LEFT JOIN Bike_Rentals\s
                ON Bike_Rentals.bike_ID = Bikes.bike_ID
                WHERE start_date IS NULL
                OR end_date < (SELECT strftime('%Y-%m-%d %H-%M', 'now'))
                ORDER BY end_date DESC
                LIMIT 1
                """);
        System.out.println(topResultAsString(anyAvailableBike, " "));
        return anyAvailableBike.getString("colour");
    }

    public int getAvailableBikeCount() throws SQLException {
        ResultSet bikeCountQuery = statement.executeQuery("""
                SELECT COUNT(Bikes.bike_ID) FROM Bikes\s
                LEFT JOIN Bike_Rentals\s
                on Bike_Rentals.bike_ID = Bikes.bike_ID
                WHERE start_date IS NULL
                OR end_date < (SELECT strftime('%Y-%m-%d %H-%M', 'now'))
                """);

        return bikeCountQuery.getInt(1);
    }

    /**
     * Gets the amount of available bikes of a specific type
     * @param colour Which colour the bike should be
     * @param type Which type of bike the bike should be
     * @param requiresHelmet Whether the user wants to have a helmet included or not
     * @return The amount of bikes available of that specific type.
     * @throws SQLException
     */
    public int getSpecificBikeCount(String colour, String type, boolean requiresHelmet) throws SQLException {
        System.out.println("Attempting to find specific bike count");
        String bikeCountQuery = """
                SELECT COUNT(Bikes.bike_ID)\s
                FROM Bikes
                LEFT JOIN Bike_Rentals\s
                ON Bike_Rentals.bike_ID = Bikes.bike_ID
                LEFT JOIN Bike_Types\s
                ON Bikes.bike_type_ID = Bike_Types.bike_type_ID
                 WHERE 
                """;
        if(!colour.isBlank()) {
            bikeCountQuery += addConditionalIfNeeded(bikeCountQuery,"colour = '" + colour + "' " ,"AND ");
        }

        if(!type.isBlank()) {
            bikeCountQuery += addConditionalIfNeeded(bikeCountQuery, "bike_type_name = '" + type + "' ", "AND ");
        }

        if(requiresHelmet) {
            bikeCountQuery += addConditionalIfNeeded(bikeCountQuery, "helmet_included = true ", "AND ");
        }

        bikeCountQuery += addConditionalIfNeeded(bikeCountQuery, "start_date IS NULL", "AND ") + """
                 OR end_date < (SELECT strftime('%Y-%m-%d %H-%M', 'now'))
                """;

        System.out.println(bikeCountQuery);
        return statement.executeQuery(bikeCountQuery).getInt(1);
    }

    /**
     * Checks if a condition can be added to the back of a partial query, adds the condition if there is not one present.
     * @param addString The string you want to add as a conditional, for example "colour = 'Yellow'".
     * @param query The original query up to the point you wish to add conditionals to.
     * @param conditional The conditional you wish to add if needed, for example AND.
     * @return The input string, with added conditionals if they are needed.
     */
    public String addConditionalIfNeeded(String query, String addString, String conditional) {
        String[] lastWordList = query.split(" ");
        String lastWord = lastWordList[lastWordList.length-1];

        //Adds conditional only if there isn't already one or it is the first conditional.
        //If there isn't 'and', 'or' or 'where', add conditional
        if(!lastWord.contains("WHERE") && !lastWord.contains("AND") && !lastWord.contains("OR")) {
            addString = conditional + " " + addString;
        }
        System.out.println("Last word = " + lastWord);
        return addString;
    }

    /**
     * Returns the top result of the query as a String.
     * @param result The result of a query.
     * @param regex The character that splits the string.
     * @return The top result in the query, as a string separated by regex.
     * @throws SQLException
     */
    private String topResultAsString(ResultSet result, String regex) throws SQLException {
        int columnCount = result.getMetaData().getColumnCount();
        StringBuilder resultString = new StringBuilder();
        //Iterate and add every column to the string.
        for(int i = 1; i < columnCount; i++)
            resultString.append(result.getString(i)).append(regex);
        return resultString.toString();
    }
}