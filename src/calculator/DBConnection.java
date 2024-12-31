/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
/**
 *
 * @author Dell_
 */
public class DBConnection {
     private static final String URL = "jdbc:mysql://localhost:3306/calculatordb"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; 

    public static Connection getConnection() throws SQLException {
        try {
         
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found!");
            e.printStackTrace();
        }

        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
