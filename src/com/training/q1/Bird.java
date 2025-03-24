package com.training.q1;

public class Bird extends Pet{
	
	private double wingSpan;

	public Bird(String name, String species, int age, double wingSpan) {
		super(name, species, age);
		this.wingSpan = wingSpan;
	}

	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
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
        System.out.println("\n--- Your Bird Details ---");
		System.out.println("Pet Name: " + getName());
		System.out.println("Species: " + getSpecies());
		System.out.println("Age: " + getAge());
		System.out.println("Favorite Toy: " + getWingSpan());
		System.out.println("Equivalent Human Age: " + humanAge);
		
	}
	
	
}
