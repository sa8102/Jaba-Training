package com.training.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
		
		
		
		System.out.println();
		System.out.println();
		System.out.println("--- Maps ---");
		System.out.println();

		// Can have duplicates values 
		//No duplicate Keys, it will be overridden 
		
		Map<Integer, String> empMap = new HashMap<>();
		empMap.put(101, "Mohammed");
		empMap.put(102, "Suleiman");
		empMap.put(103, "Farah");
		empMap.put(101, "Noorie");

		
		for(Entry<Integer, String> empEntry : empMap.entrySet() ) 
		{
			System.out.println(empEntry.getKey() + ":" + empEntry.getValue());

		}

		
		
		
		
	}
	
	

}
