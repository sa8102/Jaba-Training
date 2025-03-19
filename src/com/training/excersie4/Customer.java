package com.training.excersie4;

public class Customer {
	   private int id;
	   private String name;
	   private String email;
	   // Constructor
	   public Customer(int id, String name, String email) {
	       this.id = id;
	       this.name = name;
	       this.email = email;
	   }
	   // Getter and Setter methods
	   public int getId() {
	       return id;
	   }
	   public void setId(int id) {
	       this.id = id;
	   }
	   public String getName() {
	       return name;
	   }
	   public void setName(String name) {
	       this.name = name;
	   }
	   public String getEmail() {
	       return email;
	   }
	   public void setEmail(String email) {
	       this.email = email;
	   }
	   // toString method to display customer details
	   @Override
	   public String toString() {
	       return "Customer{id=" + id + ", name='" + name + "', email='" + email + "'}";
	   }
	}

