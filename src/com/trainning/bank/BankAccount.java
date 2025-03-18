package com.trainning.bank;

import java.util.Scanner;


public class BankAccount { // protected // private // default 

	String accountHolderName; // Instance => Can't be accessed directly, we need to create an object for it 
	
	void display() {
		int age =21; //local variable 
		accountHolderName = "David"; // object to access 
	}
	
	public static void main(String[] args) {
		
		
		System.out.println("Welocme to your Saving Account!!");		
		
		// To allow user to enter the values 
		Scanner sc = new Scanner(System.in);
		
		// nextInt() => used for int
		System.out.println("Enter Account Number : ");
		int acctNumber = sc.nextInt(); 
		sc.nextLine();
		
		// next() => used for String 
		// nextLine() ==> will jump to ROI 
		System.out.println("Enter Name : ");
		String name = sc.nextLine();
		
		// extDouble() => used for double 
		System.out.println("Enter Rate of Interest :");
		double roi = sc.nextDouble();
		System.out.println("Enter Amount : ");
		double amount = sc.nextDouble();
		
		
		// Allow us to enter values & Save it 
		SavingAccount savingAccount1 = new SavingAccount(acctNumber, name, roi, amount); // creating an instance of a class

		
		// put the calculation in a variable 
		double totalAmount = savingAccount1.calculateTotalAmount(savingAccount1.getAmount(), savingAccount1.getRoi());
		
		//This is how u call toString method
//		System.out.println(savingAccount1);

		
		System.out.println("Account Holder: " + savingAccount1.getName());
	    System.out.println("Account Number: " + savingAccount1.getAccountNumber());
	    System.out.println("Initial Amount: $" + savingAccount1.getAmount());
	    System.out.println("Rate of Interest: " + (savingAccount1.getRoi() * 100) + "%");
	    System.out.println("Total Amount After One Year: $" + totalAmount);
	    System.out.println("Total Amount After One Year: $" + totalAmount);

	    
	    String[] names = new String[4];
	    names[0] = "Sam";
	    names[1] = "John";
	    names[2] = "David";
	    names[3] = "Eman";
	    //Since this is tyString i Can't overwrite it 
	    for(int i=0; i<names.length; i++) {
		    System.out.println(names[i]);

	    }
	    
	    
	    String str1 = new String("David");
	    String str2 = new String("David");
	    String str3 = "Thomas";
	    str1 = str2;
	    System.out.println(str1.equals(str2));
	    
	    
       
        
//		System.out.println("Welocme to Bank!!");		
//		System.out.println("First Argument:" +args[0]);
//		System.out.println("Second Argument:" +args[1]);
//		
//		
//		BankAccount account1 = new BankAccount(); // creating an instance of a class
//		account1.accountHolderName = "David";
//		int i = 5;
//		short s = 10;
//		s = (short)i;
//		i = s;
//		
//		System.out.println(i);

	}
}


