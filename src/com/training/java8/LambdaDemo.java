package com.training.java8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class LambdaDemo {

	public static void main(String[] args) {
//		int result = sum(23, 45);
//		System.out.println(result);
		
		
		// Lambda = ()->
		//MyFuncInterface obj = (x,y)-> x+y;
		
		// MyFuncInterface obj1 = (x,y)-> x*y;
		
		MyFuncInterface obj2 = (x,y) -> x + " " + y;

		System.out.println(obj2.concatinate("Sam", "Smith"));
	
		
		/* 
		 * Expression that takes a value and return boolean
		 * Predicate = Class Name
		 * <Integer> = Data Type
		*/
		Predicate<Integer> val = a -> a%2 == 0;		
		System.out.println(val.test(19));
		
		


		// Consumer = Accept a value but don't return anything 
	}
	
	// because I used Lambda, I don't need this function anymore
//	private static int sum(int a, int b) {
//		return a+b;
//	}

}
