package com.training.assessment;

import java.sql.*;
import java.util.Scanner;

public class CreateAccount {
   private static final String url = "jdbc:postgresql://localhost:5432/testdb";
   private static final String username = "postgres";
   private static final String password = "pass123";
   // Method to create a new account
   public void createAccount(String name, double initialDeposit) {

       try  
       {
	       Connection connection = DriverManager.getConnection(url, username, password);
           PreparedStatement pstmt = connection.prepareStatement( "INSERT INTO bank_account (name, balance) VALUES (?, ?)");
           pstmt.setString(1, name);
           pstmt.setDouble(2, initialDeposit);
           pstmt.executeUpdate();
           System.out.println("Account created successfully for " + name + " with an initial deposit of " + initialDeposit);
       } 
       
       catch (Exception e) {
           System.out.println("Error creating account: " + e.getMessage());
       }
   }
}

