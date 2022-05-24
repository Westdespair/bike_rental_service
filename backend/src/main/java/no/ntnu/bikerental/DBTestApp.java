package no.ntnu.bikerental;

import java.sql.SQLException;

public class DBTestApp {
    DatabaseQueries databaseQueries;

    public DBTestApp() throws SQLException {
    }

    public static void main(String[] args) throws SQLException {
        DatabaseConnection.connect();
        DatabaseQueries databaseQueries = new DatabaseQueries();
        System.out.println(databaseQueries.getAnyAvailableBike());


        System.out.println("Available bike without helmet: " + databaseQueries.getSpecificAvailableBike("","",false));
        System.out.println("Available bike amount: " + databaseQueries.getAvailableBikeCount());
        System.out.println("Available yellow electric bikes with helmet: " + databaseQueries.getSpecificBikeCount("Yellow", "Electric", true));
    }
}
