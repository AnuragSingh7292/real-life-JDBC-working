package MyStudent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
    public static Connection connect() throws SQLException {
        // load driver
        // obtain connection
        //obtain statement
        //execute query
        // close connection
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String userName = "root";
        String pass = "Axyz@121";
        Connection con = DriverManager.getConnection(url,userName,pass);
        return con;
    }

}
