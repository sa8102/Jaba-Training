package com.training.java8;


// In here we will have only 1 abstract method

@FunctionalInterface
public interface MyFuncInterface {

//	int sum(int a, int b);
//	static void display() {
//		
//	}

//	int multiplication(int a, int b);
//	static void display() {
//		
//	}
	
	String concatinate(String a, String b);
	static void display() {
		
	}
	
	
	
	// abstract = define here but declare somewhere else. 
	// functional interface : only with one abstract no more than one.
	// Reduces the concept of default methods and static 


}


//1. Functional Interface 
//2. Lambda Expression 
