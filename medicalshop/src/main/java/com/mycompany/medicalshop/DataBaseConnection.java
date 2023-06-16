/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.medicalshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author RITIK
 */
public class DataBaseConnection {
   private static final String url = "jdbc:mysql://localhost:3306/medicaldatabase";    
    private static final String driverName = "com.mysql.cj.jdbc.Driver";   
    private static final String username = "root";   
    private static final String password = "";
    public static  Connection con = null;
    public static Connection getConnection(){
        try {
            Class.forName(driverName);
            try {
               con = DriverManager.getConnection(url, username, password);
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
          
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
        }
        return con;
    } 
}
