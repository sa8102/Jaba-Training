package com.training.q2;

public class Manager extends Employee {

	private String dept;
	private int size;
	
	public Manager(int empId, String empName, double salary, String dept, int size) {
		super(empId, empName, salary);
		this.dept = dept;
		this.size = size;
	}
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public void calculateBonus() {
		if(getSize() > 10) {
			double amount = getSalary() * .15 + 500;
			details(amount);
		}
		else {
			double amount = getSalary() * .15;
			details(amount);
		}
	}
	
	@Override
	public void details(double amount) {
		System.out.println("\n --- Employee Details --- \n");
		System.out.println("Employee ID: " + getEmpId());
		System.out.println("Employee Name: " + getEmpName());
		System.out.println("Management Department: " + getDept());
		System.out.println("Team Size: " + getSize());
		System.out.println("Employee Salary: " + getSalary());
		System.out.println("Bounes: " + amount);
		
		

	}
	
}
