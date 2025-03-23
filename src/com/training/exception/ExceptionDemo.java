package com.training.exception;

import java.util.InputMismatchException;

public class ExceptionDemo {
	
	public static void main(String[] args) throws InputMismatchException  // this will make sub classes know to handle exception 
	{
		int i = 5;
		int j = 0;
		int age = 16;
		double result = 0;
		
		try {
			if(age < 18) {
				throw new MinimumAgeException("Age Should not be less than 18");
			}
			result = i/j;
		}		
		catch(ArithmeticException | MinimumAgeException | NumberFormatException e) {
			if(e instanceof ArithmeticException) {
				System.out.println("An Arithmetic Exception occured!!");
			}
			else if (e instanceof MinimumAgeException) {
				System.out.println("An Arithmetic Exception occured!!");
			}
			else if (e instanceof NumberFormatException) {
				System.out.println("A Number Format Exception occured!!");
			}
		}
//		catch(ArithmeticException e) {
//			System.out.println("An Arithmetic Exception occured!!");
//		}
//		catch(MinimumAgeException e){
//			System.out.println(e.getMessage());
//		}
		finally {
			System.out.println("--- Inside the Finally Block ---");
		}
		
		System.out.println("--- Execusion Resuem ---");
	}
}
