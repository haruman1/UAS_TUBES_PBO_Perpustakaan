/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Perpustakaan {
      
      public static void main(String[] args) throws SQLException {
          new Utama().setVisible(true);
    }
    
} 

