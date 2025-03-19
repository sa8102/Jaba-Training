package com.training.practice;

import java.util.ArrayList;



// Array List Concept Practice
public class ProductTest1 {
	
	private String name; 
	private double price;

    public ProductTest1(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public static void main(String[] args) {
    	

		ArrayList<ProductTest1> products = new ArrayList<>();
		
		products.add(new ProductTest1("Pizza", 20));
		products.add(new ProductTest1("Smoothi", 15));
		products.add(new ProductTest1("Coffee", 10));
		products.add(new ProductTest1("Tart", 6));

		
		for(ProductTest1 product: products) {
	        System.out.println("Name: " + product.getName() + ", Price: $" + product.getPrice());
		}
	}
		
    }
	
  

