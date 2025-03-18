package com.trainning.bank;
import java.util.Scanner;


public class Exercise3SavingAccount extends Exercise3Account {
	
	private double roi;
	private double amount;

	
	public Exercise3SavingAccount(int accountNumber, String accountHolderName, double balance, double roi, double amount) {
		super(accountNumber, accountHolderName, balance);
		this.roi = roi;
		this.amount = amount;
	}
	
	public double getRoi() {
		return roi;
	}
	public void setRoi(double roi) {
		this.roi = roi;
	}
	
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

	// method to add an account & apply interest 
	@Override 
	public void applyInterest() {
		double roiBalance = (getBalance() + (getBalance() * this.roi));
		System.out.println("--- Your Account have been created Successfully!! ---");
		System.out.println("Your ROI with current balance of " + getBalance() + "$ will be: " + roiBalance + "$");
	}
	
	// method to deposit & update balance of account
	 @Override 
	public void deposit() {
		setBalance(getBalance() + amount);
		System.out.println("Deposit Successful! New Balance: " + getBalance() + "$");
	}
	 
	
	// method to deposit & update balance of account
	@Override 
	public void withdraw() {
		if (getBalance() > amount)
		{
			System.out.println("--- No Sufficient Amount to process this Transaction ---");
			System.out.println("Your current Balance is " + getBalance() + "$");
		}
		else if (getBalance() > amount)
		{
		setBalance(getBalance() - amount);
		System.out.println("Deposit Successful! New Balance: " + getBalance() + "$");
		}
	}
	 
	 
	 
	
	
	public static void main(String[] args) {
		
		//Define Scanner & Variables 
		Scanner sc = new Scanner(System.in);
		int userSelection = 0; 
		
		// To allow user to choose from a menu 
		System.out.println("--- Welcome to Bank Chatbot --- ");
		System.out.println("Select 1 to add an Account");
		System.out.println("Select 2 to Deposit Cash");
		System.out.println("Select 3 to Withdraw Cash");
		System.out.println("Select 4 to check account balance");
        System.out.println("Insert your choice here: ");
		int userSelection1 = sc.nextInt(); 
		
		// Allow user to add an account 
		if (userSelection1 == 1) {
			
			System.out.println("Enter Account Number: ");
			int acctNumber = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Account Holder Name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter Balance Number: ");
			double balance = sc.nextDouble();
			
			System.out.println("Enter Rate of Inverstment: ");
			double roi = sc.nextDouble();
			
			System.out.println("Enter Amount of Deposite or Withdraw. Enter 0 if you don't want to process any Transaction");
			double amount = sc.nextDouble();
			
			
			Exercise3SavingAccount account = new Exercise3SavingAccount(acctNumber, name, balance, roi, amount); 
			
			account.applyInterest();
			
		}
		
	
		
		// To deposit amount 
		if (userSelection1 == 2) {
			
			System.out.println("Enter Account Number: ");
			int acctNumber = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Account Holder Name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter Balance Number: ");
			double balance = sc.nextDouble();
			
			System.out.println("Enter Rate of Inverstment: ");
			double roi = sc.nextDouble();
			
			System.out.println("Enter Deposite Amount");
			double amount = sc.nextDouble();
			
			
			Exercise3SavingAccount account = new Exercise3SavingAccount(acctNumber, name, balance, roi, amount); 
			
			account.deposit();
									
		}
		
		// To withdraw amount 
		if (userSelection1 == 3) {
			
			System.out.println("Enter Account Number: ");
			int acctNumber = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Account Holder Name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter Balance Number: ");
			double balance = sc.nextDouble();
			
			System.out.println("Enter Rate of Inverstment: ");
			double roi = sc.nextDouble();
			
			System.out.println("Enter Deposite Amount");
			double amount = sc.nextDouble();
			
			
			Exercise3SavingAccount account = new Exercise3SavingAccount(acctNumber, name, balance, roi, amount); 
			
			account.withdraw();
									
		}
		
		

		
		sc.close();

	}
}
