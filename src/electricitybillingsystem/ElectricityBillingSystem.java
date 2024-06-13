/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package electricitybillingsystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Zim
 */
public class ElectricityBillingSystem {

    static final String DB_URL = "jdbc:mysql://localhost/";
   static final String USER = "root";
   static final String PASS = "";
    public static void main(String[] args) {
         try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement s = conn.createStatement();
      ) {		      
         String sql = "CREATE DATABASE ebsByZim";
         s.executeUpdate(sql);
            new Loading().setVisible(true);
      } catch (SQLException e) {
         e.printStackTrace();
         new Loading().setVisible(true);
      } 
    }
    
}
