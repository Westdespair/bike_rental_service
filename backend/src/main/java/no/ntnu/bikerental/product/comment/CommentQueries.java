package no.ntnu.bikerental.product.comment;

import no.ntnu.bikerental.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class CommentQueries {
    Connection connection = DatabaseConnection.connect();
    Statement statement = connection.createStatement();

    public CommentQueries() throws SQLException {
    }

    /**
     * Adds a comment to a given product
     * @param userID the customer_ID of the user in the database
     * @param productID the product_ID of the product the user comments on
     * @param content The comment itself.
     * @throws SQLException If there is a database connectivity error
     */
    public void addComment(int userID, int productID, String content) throws SQLException {
        statement.executeQuery("INSERT INTO Comments (content, product_ID, post_date, customer_ID) " +
                "VALUES("
                + "'" + content + "', "
                + productID + ","
                + "datetime('now'), "
                + userID +"))");
    }

    /**
     * @param userID the customer_ID of the user in the database
     * @param commentID the comment_ID of the current comment in the database
     * @param newContent the content that will replace the current existing content
     * @throws SQLException If there is a database connectivity error
     */
    public void editComment(int userID, int commentID, String newContent) throws SQLException {
        statement.executeQuery("UPDATE Comments "
                + "SET content = "
                + "'" + newContent + "',"
                + "edit_date = datetime('now') "
                + "WHERE customer_ID = " + userID
                + " AND " + "comment_ID = " + commentID);
    }

    /**
     * Deletes a given comment if the user has permission. Users only have permission to delete their own comment.
     * Admins can delete other comments
     * @param commentID the comment_ID of the comment to be deleted
     * @param customerID the user ID of the user requesting deletion
     */
    public void deleteComment(int commentID, int customerID) throws SQLException {
        String userRole = getUserRole(customerID);

        if(userRole.equalsIgnoreCase("ADMIN")) {
            statement.executeQuery("DELETE FROM Comments "
                    + "WHERE comment_ID = " + commentID);

        } else if(userRole.equalsIgnoreCase("USER")){
            statement.executeQuery("DELETE FROM Comments "
                    + "WHERE customer_ID = " + customerID
                    + " AND " + "comment_ID = " + commentID);
        }
    }

    /**
     * Returns the privilege level of users. Often decides which rights they have to different functions.
     * @param customerID The ID of the user we want to check privileges for.
     * @return int privilege, 0 for banned user, 1 for user, 2 for admin
     * @throws SQLException If there is a database connectivity error
     */
    private String getUserRole(int customerID) throws SQLException {
        return statement.executeQuery("SELECT role FROM Customers " +
                "WHERE customer_ID = " + customerID).getString("role");
    }
}
