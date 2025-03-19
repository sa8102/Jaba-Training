//package com.trainning.bank;
//
//import java.util.Scanner;
//
//public class Exercise2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double[] amounts = new double[4]; // Array to store amounts
//        
//        for (int i = 0; i < 4; i++) {
//            // To allow user to enter the values
//            
//            System.out.println("Enter Account Number: ");
//            int acctNumber = sc.nextInt();
//            sc.nextLine(); // Consume newline
//            
//            System.out.println("Enter Name: ");
//            String name = sc.nextLine();
//            
//            System.out.println("Enter Rate of Interest:");
//            double roi = sc.nextDouble();
//            
//            System.out.println("Enter Amount: ");
//            double amount = sc.nextDouble();
//            
//            // Store the amount in the array
//            amounts[i] = amount;
//            
//            // Assuming SavingAccount has a constructor with (int, String, double, double)
//            SavingAccount account = new SavingAccount(acctNumber, name, roi, amount);
//            
//            System.out.println("Account created: " + account);
//        }
//        
//        // Find the highest amount
//        double highestAmount = amounts[0];
//        for (int i = 1; i < amounts.length; i++) {
//            if (amounts[i] > highestAmount) {
//                highestAmount = amounts[i];
//            }
//        }
//        
//        System.out.println("The highest amount is: " + highestAmount + " $");
//        
//        sc.close(); // Close scanner to avoid memory leaks
//    }
//}
