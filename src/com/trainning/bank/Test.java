package com.trainning.bank;

public class Test {
	
	/*
	 * Create a class named FixedDepositAccount with attributes accountNumber, holderName, principalAmount, interestRate, and durationInYears.
	 * Tasks:
	 * 		Create a method calculateMaturityAmount() inside the class that returns the total amount after the specified duration (using compound interest formula).
	 * 		Create a main method to create an object of FixedDepositAccount, set values, and print the maturity amount.
	 */

	String accountNumber;
	String holderName;
	double principalAmount;
	double interestRate;
	int durationInYears;
	
	
	public double calculateMaturityAmount(double principalAmount, double interestRate, int durationInYears){
		return (principalAmount * Math.pow((1 + interestRate), durationInYears));
	}
	
	
	public static void main(String[] args) {
		
	Test account1 = new Test();
	
	account1.accountNumber = "1234ABC";
	account1.holderName = "Sam Smith";
	account1.principalAmount = 1200.50;
	account1.interestRate = 0.06;
	account1.durationInYears = 3;
	
	
	double maturityAmount = account1.calculateMaturityAmount(account1.principalAmount,account1.interestRate,account1.durationInYears);	

	
	System.out.println("Account Number: " + account1.accountNumber);
	System.out.println("Account Holder Name: " + account1.holderName);
	System.out.println("Principal Amount : " + account1.principalAmount);
	System.out.println("Interest Rate : " + account1.interestRate * 100 + " %");
	System.out.println("Duration In Years : " + account1.durationInYears);
	System.out.println("Maturity Amount : " + maturityAmount);

	
		 
	}
}