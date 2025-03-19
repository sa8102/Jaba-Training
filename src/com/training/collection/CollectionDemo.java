package com.training.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		
		System.out.println("-- This is our List --");
		// List
		List<String> names = new ArrayList<>();
		names.add("Ahmed");
		names.add("Hassan");
		names.add("Ali");
		names.add("Fatimah");
		names.add("Ali");
		
		// 1 way to go through all variables 
		for(String name:names) {
			System.out.println(name);
		}
		
		// 2nd way to go through all variables 
//		Iterator<String> iter = names.iterator();
//		
//		while(iter.hasNext()) {
//			System.out.println(iter.next());
//		}
		
		System.out.println();
		System.out.println("-- This is our Set --");

		//Sets 
		Set<String> names1 = new HashSet<>();
		names1.add("Ahmed");
		names1.add("Hassan");
		names1.add("Ali");
		names1.add("Fatimah");
		names1.add("Ali");
		
		// 1 way to go through all variables 
		for(String name:names1) {
			System.out.println(name);
		}
		
		
		
		// 2nd way to go through all variables 
//		Iterator<String> iter1 = names1.iterator();
//		
//		while(iter1.hasNext()) {
//			System.out.println(iter1.next());
//		}
		
		
		System.out.println();
		System.out.println("-- These are our Employee --");
		
		Set<Employee> empSet = new HashSet<>();
		empSet.add(new Employee(101, "Harith", "IT", 2000));
		empSet.add(new Employee(102, "Sara", "CEO", 40000));
		empSet.add(new Employee(103, "Talal", "Accounts", 3000));
		empSet.add(new Employee(103, "Eman", "IT", 20000));
		empSet.add(new Employee(101, "Harith", "IT", 2000));

		
		for(Employee emp:empSet)
		{
			System.out.println(emp);
		}
		
		
	}
	
	

}
