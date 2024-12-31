/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;
import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Dell_
 */
public class DBTest {
     public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {
            if (conn != null) {
                System.out.println("Database connected successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
