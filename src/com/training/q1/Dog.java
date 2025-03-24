package com.training.q1;

public class Dog extends Pet {

	private String toy;

	public Dog(String name, String species, int age, String toy) {
		super(name, species, age);
		this.toy = toy;
	}

	public String getToy() {
		return toy;
	}

	public void setToy(String toy) {
		this.toy = toy;
	}

	
	public void calcAge() {
		int humanAge;
		if(getAge() < 2) {
			humanAge = getAge() * 10;
		}
		else {
			humanAge = (int) (16 * Math.log(getAge()) + 31);
		}
		display(humanAge);
	}
	
	public void display(int humanAge) {
        System.out.println("\n--- Your Dog Details ---");
		System.out.println("Pet Name: " + getName());
		System.out.println("Species: " + getSpecies());
		System.out.println("Age: " + getAge());
		System.out.println("Favorite Toy: " + getToy());
		System.out.println("Equivalent Human Age: " + humanAge);
		
	}
	
	
}
