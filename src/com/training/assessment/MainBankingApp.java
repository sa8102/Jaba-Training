package com.training.assessment;
import java.util.Scanner;


public class MainBankingApp {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       AccountManagement accountManagement = new AccountManagement();
       CreateAccount createAccount = new CreateAccount();
      
       while (true) {
           System.out.println("--- Bank Application ChatBot ---");
           System.out.println("Select 1 To Create Account");
           System.out.println("Select 2 Deposit Money");
           System.out.println("Select 3 Withdraw Money");
           System.out.println("Select 4 Transfer Money");
           System.out.println("Select 5 Check Balance");
           System.out.println("Select 6 Exit");
           System.out.print("Enter your choice: ");
          
           int choice = scanner.nextInt();
           if (choice == 1) {
               // Create Account
               System.out.print("Enter your name: ");
               String name = scanner.next();
              
               System.out.print("Enter initial deposit amount: ");
               double initialDeposit = scanner.nextDouble();
              
               createAccount.createAccount(name, initialDeposit);
           } 
           
           else if (choice == 2) {
               // Deposit Money
               System.out.print("Enter your account number: ");
               int accountNumber = scanner.nextInt();
              
               System.out.print("Enter amount to deposit: ");
               double amount = scanner.nextDouble();
              
              
               accountManagement.depositMoney(accountNumber, amount);
           } 
           
           else if (choice == 3) {
               // Withdraw Money method
               System.out.print("Enter your account number: ");
               int accountNumber = scanner.nextInt();
               System.out.print("Enter amount to withdraw: ");
               double amount = scanner.nextDouble();
               accountManagement.withdrawMoney(accountNumber, amount);
           } 
           
           else if (choice == 4) {
               // Transfer Funds method
               System.out.print("Enter sender account number: ");
               int fromAccount = scanner.nextInt();
              
               System.out.print("Enter receiver account number: ");
               int toAccount = scanner.nextInt();
              
               System.out.print("Enter amount to transfer: ");
               double amount = scanner.nextDouble();
              
               accountManagement.transferFunds(fromAccount, toAccount, amount);
           } 
           
           else if (choice == 5) {
               // Check Balance
               System.out.print("Enter your account number: ");
               int accountNumber = scanner.nextInt();
               accountManagement.checkBalance(accountNumber);
           } 
           
           else if (choice == 6) {
               // Exit
               System.out.println("Exiting the application. Goodbye!");
               break;  // Exit the loop and end the program
           } 
           
           else {
               System.out.println("Invalid choice! Please try again.");
           }
       }
       scanner.close();
   }
}

