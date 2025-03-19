package com.training.collection;

import java.util.Objects;

public class Employee {

	private int empId;
	private String empName;
	private String depName;
	private double salary;
	
	public Employee(int empId, String empName, String depName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.depName = depName;
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

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
    public String toString() {
        return "ID=" + empId + ", Name=" + empName + ", Department=" + depName + ", Salary=" + salary;
    }

	
	// Hash Code 
	// Remove Duplicates 
	@Override
	public int hashCode() {
		return this.empId;
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		return Objects.equals(depName, other.depName) && empId == other.empId && Objects.equals(empName, other.empName)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	
	

}
