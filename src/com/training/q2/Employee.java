package com.training.q2;

public class Employee {

	private int empId;
	private String empName;
	private double salary;
	
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void calculateBonus() {
		double amount = getSalary() * .1;
		details(amount);
	}
	
	public void details(double amount) {
		System.out.println("\n --- Employee Details --- \n");
		System.out.println("Employee ID: " + getEmpId());
		System.out.println("Employee Name: " + getEmpName());
		System.out.println("Employee Salary: " + getSalary());
		System.out.println("Bounes: " + amount);

	}
	
}
