package com.trainning.bank;

import java.util.Scanner;

/*
 * Create a class SavingsAccount that extends BankAccount and adds an interest rate.
 * Write a method to calculate and add interest to the balance.
 */
public class Test2SavingAccount extends Test2BankAccount{

	private double interestRate;

	
	public Test2SavingAccount(int accountNumber, String accontHolderName, double balance, double interestRate) {
		super(accountNumber, accontHolderName, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	
	public void applyInterest()
	{
        setBalance(getBalance() + (getBalance() * this.interestRate));
        System.out.println("Interest Applied! New Balance: " + getBalance()); 
	}

	public static void main(String[] args) {
		// To allow user to enter the values 
				Scanner sc = new Scanner(System.in);
						
				// nextInt() => used for int
				System.out.println("Enter Account Number : ");
				int acctNumber = sc.nextInt(); 
				sc.nextLine();
						
				// next() => used for String 
				System.out.println("Enter Name : ");
				String name = sc.nextLine();
						
				// extDouble() => used for double 
				System.out.println("Enter Balance : ");
				double balance = sc.nextDouble();
				sc.nextLine();

				//Interest Rate
				System.out.println("Enter Interest Rate : ");
				double intRate = sc.nextDouble();
				
				
				Test2BankAccount account1 = new Test2SavingAccount(acctNumber, name, balance, intRate);
				
		        // Apply interest and display new balance
		        account1.applyInterest();

		        // Close Scanner
		        sc.close();
	}

}
