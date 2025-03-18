package com.trainning.bank;

import java.util.Scanner;

public class Test2Transaction extends Test2BankAccount {
	
	private double amount;
	private String transactionType;
	
	//Constructor
    public Test2Transaction(int accountNumber, String accountHolderName, double balance, String transactionType, double amount) {
        super(accountNumber, accountHolderName, balance); // Calls parent constructor
        this.amount = amount;
        this.transactionType = transactionType;
    }
    
    //Deposite method
	@Override
    public void deposit(){ 
		setBalance(getBalance() + amount); // Updates balance
		System.out.println("Deposit Successful! New Balance: " + getBalance());
	}
	
	//Withdraw method
	@Override
	public void withdraw(){ 
		if (amount > getBalance()) {
            System.out.println("Insufficient Funds! Transaction Failed.");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal Successful! Remaining Balance: " + getBalance());
        }
	} 
	
	
	//Setter & Getter
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
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

		// nextLine() ==> will jump to ROI 
		System.out.println("Enter Transaction Type (D for Deposite & W for Withdraw) : ");
		String type = sc.nextLine();
		
		//
		System.out.println("Enter Amount : ");
		double amount = sc.nextDouble();
		
		
		Test2BankAccount account1 = new Test2Transaction(acctNumber, name, balance, type, amount);
		
        // Performing the transaction
        if (type.equals("D")) {
            account1.deposit();
        } else if (type.equals("W")) {
            account1.withdraw();
        } else {
            System.out.println("Invalid Transaction Type.");
        }
		

        System.out.println(account1);

        sc.close();
        
	}

}
