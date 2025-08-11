
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Db_Connect {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            // Step 1: Load the JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver"); // Example for MySQL

            // Step 2: Establish a Connection
            String url = "jdbc:mysql://localhost:3306/ims";
            String user = "root";
            String password = "mypassword";
            connection = DriverManager.getConnection(url, user, password);

            // Step 3: Create a Statement
            statement = connection.createStatement();

            // Step 4: Execute a Query (e.g., SELECT)
            String sql = "SELECT id, name FROM users";
            resultSet = statement.executeQuery(sql);

            // Step 5: Process the Result
            Boolean isFirstRow = true;
            while (resultSet.next()) {
                if (!isFirstRow) {
                    System.out.println("  ID   |   Name  ");
                    isFirstRow = false;
                }
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        } finally {
            // Step 6: Close Resources
            try {
                if (resultSet != null)
                    resultSet.close();
                if (statement != null)
                    statement.close();
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                System.err.println("Error closing resources: " + e.getMessage());
            }
        }
    }
}
