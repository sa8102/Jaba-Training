package com.trainning.bank;

public  class Account {
	
	// Declaring Instance Variable, (Variable = Attribute) 
	private int accountNumber; 
	private String name; 
	private double amount; 
	
	//Constructor
	public Account(int accountNumber, String name, double amount) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.amount = amount;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	public String display() {
		return "Account Number : " + this.accountNumber + " Amount : " + this.amount;
	}
		
}
