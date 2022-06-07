package no.ntnu.bikerental.queries;

import no.ntnu.bikerental.DatabaseConnection;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerQueries {
    Connection connection = DatabaseConnection.connect();
    Statement statement = connection.createStatement();

    public CustomerQueries() throws SQLException {

    }

    /**
     * Edits the name of a given user
     * @param customerID ID of the customer whose name will be changed
     * @param newName The new name of the customer
     */
    public void setName(int customerID, String newName) throws SQLException {
        statement.executeQuery("UPDATE Customers " +
                "SET customer_name = " + newName
                + " WHERE customer_ID = " + customerID);
    }

    /**
     * Sets the address, locationname, and postalnumber
     * @param customerID The ID of the user that will be edited
     * @param newAddress The new address
     * @param newLocationName The new location
     * @param newPostalNumber The new postalnumber.
     */
    public void setAddress(int customerID, String newAddress, String newLocationName, int newPostalNumber ) throws SQLException {
        statement.executeQuery("UPDATE Customers "
                + "SET address = " + newAddress
                + ", location_name = " + newLocationName
                + ", postal_number = " + newPostalNumber
                + " WHERE customer_ID = " + customerID);
    }

    /**
     * Sets the email of an user to a desired new email
     * @param customerID ID of the user to change the email of
     * @param newEmail The new email of the user
     */
    public void setEmail(int customerID, String newEmail) throws SQLException {
        statement.executeQuery("UPDATE Customers "
        + "SET email = " + newEmail
        + " WHERE customer_ID = " + customerID);
    }

    /**
     * Changes the password to a new password if the input password matches the current password.
     * @param customerID the ID of the user to change the password of
     * @param oldPassword the previous unencrypted password of the given user
     * @param newPassword the new password the user wants to use
     */
    public void setPassword(int customerID, String oldPassword, String newPassword) throws SQLException {
        BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder();
        String newEncryptedPassword = bCrypt.encode(newPassword);

        if(bCrypt.matches(oldPassword,getEncryptedPassword(customerID))) {
            statement.executeQuery("UPDATE Customers " +
                    "SET password = " + newEncryptedPassword + " "
                    + "WHERE customer_ID = " + customerID);
        }
    }

    /**
     * If the current user is an admin, allow them to set the new role for an user
     * @param currentUser The current user attempting to change roles
     * @param roleChangeUser The user that will get a new role
     * @param newRole The name of the new role
     */
    public void setRole(int currentUser,int roleChangeUser, String newRole) throws SQLException {
        String currentUserRole = statement.executeQuery("SELECT role " +
                "FROM Customers " +
                "WHERE customer_ID = " + currentUser).getString("role");

        if(currentUserRole.equalsIgnoreCase("ADMIN")) {
            statement.executeQuery("UPDATE Customers " +
                    "SET role = " + newRole + " "
            + "WHERE customer_ID = " + roleChangeUser);
        }
    }

    /**
     *
     * @param customerID The owner of the password
     * @return The encrypted password as a string
     * @throws SQLException if the SQL connectivity is broken
     */
    private String getEncryptedPassword(int customerID) throws SQLException {
        return statement.executeQuery("SELECT password FROM Customers " +
                "WHERE customer_ID = " + customerID).getString("password");
    }
}
