package com.training.assessment;
import java.sql.*;
public class AccountManagement {
	   private static final String url = "jdbc:postgresql://localhost:5432/testdb";
	   private static final String user = "postgres";
	   private static final String password = "pass123";
   
   // Method to deposit money into an account
   public void depositMoney(int accountNumber, double amount) {
       String query = "UPDATE bank_account SET balance = balance + ? WHERE account_number = ?";
       try {
    	   Connection connection = DriverManager.getConnection(url, user, password);
           PreparedStatement pstmt = connection.prepareStatement(query);
           pstmt.setDouble(1, amount);
           pstmt.setInt(2, accountNumber);
           int rowAffected = pstmt.executeUpdate();
           if (rowAffected > 0) {
               System.out.println("Deposited " + amount + " to account " + accountNumber + " Successfully");
           } 
           
       } catch (SQLException e) {
           System.out.println("Error depositing money: " + e.getMessage());
       }
   }
   
   
   // Method to withdraw money from an account
   public void withdrawMoney(int accountNumber, double amount) {
       String query = "UPDATE bank_account SET balance = balance - ? WHERE account_number = ? AND balance >= ?";
       try {
    	   Connection connection = DriverManager.getConnection(url, user, password);
           PreparedStatement pstmt = connection.prepareStatement(query);
           pstmt.setDouble(1, amount);
           pstmt.setInt(2, accountNumber);
           pstmt.setDouble(3, amount); 
           int rowAffected = pstmt.executeUpdate();
           
           if (rowAffected > 0) {
               System.out.println("Withdrew " + amount + " from account " + accountNumber + " Successfully");
           } 
           
       } 
       catch (SQLException e) {
           System.out.println("Error withdrawing money: " + e.getMessage());
       }
   }
   
   
   
   // Method to check balance of an account
   public void checkBalance(int accountNumber) {
       String query = "SELECT balance FROM bank_account WHERE account_number = ?";
       
       try {
    	   Connection connection = DriverManager.getConnection(url, user, password);
           PreparedStatement pstmt = connection.prepareStatement(query);
           pstmt.setInt(1, accountNumber);
           ResultSet rowAffected = pstmt.executeQuery();
           
           if (rowAffected.next()) {
               double balance = rowAffected.getDouble("balance");
               System.out.println("You Current Balance " + balance);
           } 
       } 
       
       catch (SQLException e) {
           System.out.println("Error checking balance: " + e.getMessage());
       }
   }
   
   
   
   // Method to transfer funds from one account to another
   public void transferFunds(int fromAccount, int toAccount, double amount) {
       if (amount <= 0) {
           System.out.println("Amount must be greater than 0.");
           return;
       }
       Connection connection = null;
       PreparedStatement pstmtWithdraw = null;
       PreparedStatement pstmtDeposit = null;
       String withdrawQuery = "UPDATE bank_account SET balance = balance - ? WHERE account_number = ? AND balance >= ?";
       String depositQuery = "UPDATE bank_account SET balance = balance + ? WHERE account_number = ?";
       try {
           connection = DriverManager.getConnection(url, user, password);
           connection.setAutoCommit(false);  // Start transaction
           // Withdraw from the sender account
           pstmtWithdraw = connection.prepareStatement(withdrawQuery);
           pstmtWithdraw.setDouble(1, amount);
           pstmtWithdraw.setInt(2, fromAccount);
           pstmtWithdraw.setDouble(3, amount);  // Ensure there's enough balance
           int rowsAffectedWithdraw = pstmtWithdraw.executeUpdate();
           // If withdrawal is successful, deposit to the receiver account
           if (rowsAffectedWithdraw > 0) {
               pstmtDeposit = connection.prepareStatement(depositQuery);
               pstmtDeposit.setDouble(1, amount);
               pstmtDeposit.setInt(2, toAccount);
               int rowsAffectedDeposit = pstmtDeposit.executeUpdate();
               if (rowsAffectedDeposit > 0) {
                   connection.commit();
                   System.out.println("Transferred " + amount + " from account " + fromAccount + " to account " + toAccount);
               } else {
                   connection.rollback();
                   System.out.println("Error: Receiver account not found.");
               }
           } else {
               connection.rollback();
               System.out.println("Error: Insufficient balance or sender account not found.");
           }
       } catch (SQLException e) {
           try {
               if (connection != null) {
                   connection.rollback();
               }
           } catch (SQLException rollbackEx) {
               System.out.println("Error rolling back transaction: " + rollbackEx.getMessage());
           }
           System.out.println("Error transferring funds: " + e.getMessage());
       } finally {
           try {
               if (pstmtWithdraw != null) pstmtWithdraw.close();
               if (pstmtDeposit != null) pstmtDeposit.close();
               if (connection != null) connection.setAutoCommit(true);  // Reset to default autocommit behavior
           } catch (SQLException e) {
               System.out.println("Error closing resources: " + e.getMessage());
           }
       }
   }
   
   
}
