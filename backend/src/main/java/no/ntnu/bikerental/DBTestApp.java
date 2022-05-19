package no.ntnu.bikerental;

import java.sql.SQLException;

public class DBTestApp {
    DatabaseQueries databaseQueries;

    public DBTestApp() throws SQLException {
    }

    public static void main(String[] args) throws SQLException {
        DatabaseConnection.connect();
        DatabaseQueries databaseQueries = new DatabaseQueries();
        databaseQueries.getAnyAvailableBike();

    }
}
