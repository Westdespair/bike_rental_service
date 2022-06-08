package no.ntnu.bikerental.queries;

import no.ntnu.bikerental.DatabaseConnection;
import org.json.JSONArray;
import org.json.JSONObject;

import java.sql.*;
import java.util.ArrayList;

/**
 * Takes in query responses and treats them in different ways, such as converting to a JSON-array
 */
public class QueryResponseManager {
    Connection connection = DatabaseConnection.connect();
    Statement statement = connection.createStatement();

    public QueryResponseManager() throws SQLException {
    }
    public JSONArray getResultSetAsJSON(ResultSet result) throws SQLException {
        ResultSetMetaData resultMetaData = result.getMetaData();
        int columnAmount = resultMetaData.getColumnCount();
        ArrayList<String> columnNames = new ArrayList<>();

        //Gets all columns as an array
        for(int i = 1; i < columnAmount; i++) {
            columnNames.add(resultMetaData.getColumnName(i));
        }

        JSONArray jsonArray = new JSONArray();
            while (result.next()) {
                JSONObject row = new JSONObject();
                for (String column: columnNames) {
                    row.put(column, result.getObject(column));
                }
                jsonArray.put(row);
        }
            for(Object item : jsonArray) {
                System.out.println(item.toString());
            }
        return jsonArray;
    }
}
