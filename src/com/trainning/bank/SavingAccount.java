package com.trainning.bank;

/*
 * CREATE A CLASS NAMED SAVINGACCOUNT WITH ATTRIBUTES ACCOUNTNUMBER, NAME, ROI AND AMOUNT 
 * CREATE A METHOD CALCULATE INSIDE THE CLASS AND RETURN THE TOTAL AMOUNT AFTER ONE YEAR.
 */


public class SavingAccount {
	// Declaring Instance Variable, (Variable = Attribute) 
	private int accountNumber; 
	private String name; 
	private double roi; 
	private double amount; 
	
	/*
	 *  Constructor
	 *  	Can have all the variables that i declared 
	 *  
	 *  once i include parameter when i call the function I have to add a value for it 
	 */
	
	public SavingAccount(int accountNumber, String name, double roi, double amount) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.roi = roi;
		this.amount = amount;

		
	}
	
	//Getter & Setter will be created so that we can access private instance outside the package 
	
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


		// Method to calculate total amount after one year (Method = Behavior)
		public double calculateTotalAmount(double amount, double roi) {
			return amount + (amount * roi);
    }
	
	// Overwriting toString method to display 	
	public String toString(){
		return "Account Number : " + this.accountNumber + " Amount : " + this.amount;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Welocme to your Saving Account!!");		
			
		SavingAccount savingAccount1 = new SavingAccount(1265, "David", 0.1, 1000); // creating an instance of a class

		
		// put the calculation in a variable 
		double totalAmount = savingAccount1.calculateTotalAmount(savingAccount1.amount, savingAccount1.roi);
		
		System.out.println("Account Holder: " + savingAccount1.name);
        System.out.println("Account Number: " + savingAccount1.accountNumber);
        System.out.println("Initial Amount: $" + savingAccount1.amount);
        System.out.println("Rate of Interest: " + (savingAccount1.roi * 100) + "%");
        System.out.println("Total Amount After One Year: $" + totalAmount);
			
	}

}





