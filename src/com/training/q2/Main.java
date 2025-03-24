package com.training.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Employee emp = new Employee(123, "Sam", 2000.0);
		emp.details(2000.0);
		
		
		Manager manager = new Manager(321, "Doe", 3000.0, "IT" ,10);
		manager.details(3000.0);
	}
}
