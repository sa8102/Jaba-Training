package com.trainning.bank;

public class Exercise3Account {

	private int accountNumber;
	private String accountHolderName;
	private double balance;
	
	
	public Exercise3Account(int accountNumber, String accountHolderName, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

	public void withdraw() {
		// TODOAuto-Generated method stub
	}
	
	public void deposit() {
		// TODO Auto-generated method stub	
	}


	public void applyInterest() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}

