package com.trainning.bank;

import java.util.Scanner;

/* 
 * Basic Account Class:
 * Create a Java class BankAccount with fields for accountNumber, accountHolderName, and balance.
 * Write a constructor and methods to deposit() and withdraw() money.
 * Ensure that the balance do not  go negative.
 */


public class Test2BankAccount {
	
	private int accountNumber;
	private String accontHolderName;
	private double balance;
	
	//Constructor 
	public Test2BankAccount(int accountNumber, String accontHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accontHolderName = accontHolderName;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccontHolderName() {
		return accontHolderName;
	}

	public void setAccontHolderName(String accontHolderName) {
		this.accontHolderName = accontHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
    //Deposit method
	public void deposit(){ 
		
	}
	
	//Withdraw method
	public void withdraw(){ 
		
	} 
	
    public String toString() {
        return "Account Number: " + this.accountNumber + " ,Card Holder Name: " + this.accontHolderName + " ,Current Balance is: " + this.balance;
    } 
    
	public void applyInterest() {
		// TODO Auto-generated method stub
		
	}
	

	public static void main(String[] args) {
	

	}


	
}
