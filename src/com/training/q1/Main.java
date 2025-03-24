package com.training.q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println();
			System.out.println("Press 1 to Choose 'Dog' as your Pet");
			System.out.println("Press 2 to Choose 'Bird' as your Pet");
			System.out.println("Press 3 to Exit");
			System.out.print("Enter your Choice:");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				// Taking Dog details
                System.out.println("\n--- Enter Dog Details ---");
                sc.nextLine();
                System.out.print("Enter Dog Name: ");
                String name = sc.nextLine();
              
                System.out.print("Enter Dog Species: ");
                String species = sc.nextLine();
                System.out.print("Enter Dog Age: ");
                int age = sc.nextInt();
                sc.nextLine(); // Clear buffer
                System.out.print("Enter Dog's Favorite Toy: ");
                String toy = sc.nextLine();
				
				Dog pet = new Dog(name, species, age, toy);

				pet.calcAge();
				
			}
			else if(choice == 2) {
				// Taking Bird Details
                System.out.println("\n--- Enter Bird Details ---");
                sc.nextLine();
                System.out.print("Enter Bird Name: ");
                String name = sc.nextLine();
              
                System.out.print("Enter Bird Species: ");
                String species = sc.nextLine();
                System.out.print("Enter Bird Age: ");
                int age = sc.nextInt();
                sc.nextLine(); // Clear buffer
                System.out.print("Enter Bird Wing Span: ");
                int wingSpan = sc.nextInt();
				
				Bird pet = new Bird(name, species, age, wingSpan);

				pet.calcAge();
				
			}
			else if(choice == 3) {
				System.out.println("Disconnected");
				break;
			}
			else {
				System.out.println("Invalid Input");
			}
			
		}
	}

}
