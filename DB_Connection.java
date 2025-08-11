import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // load JDBC Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql//localhost:3306/testdb";
        String user = "root";
        String pass = "root";
        String driver = "com.mysql.cj.jdbc.Driver";
        // create a connection
        Connection conn = DriverManager.getConnection(url, user, pass);
        
        
        // create a connection


    }
}
