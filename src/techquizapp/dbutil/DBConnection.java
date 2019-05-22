/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package techquizapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author JAIN
 */
public class DBConnection {
     private static Connection conn;
    static {
          try{
    Class.forName("oracle.jdbc.OracleDriver");
    conn = DriverManager.getConnection("jdbc:oracle:thin:@//LAPTOP-B6GSRK6N:1521/XE", "onlineexamapp", "tiger");
    JOptionPane.showMessageDialog(null," connected to database");
    
    }
    catch(Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null,"cannot connect to database");
    
    }
    
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
      try{
          conn.close();
   JOptionPane.showMessageDialog(null," closed sucessfully");
    
    }
    catch(Exception e) {
    e.printStackTrace();
   JOptionPane.showMessageDialog(null,"can not close connection");
    
    }
    }
}

    
