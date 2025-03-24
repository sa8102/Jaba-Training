package com.training.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Department> deptList = new ArrayList<>();
		// Create Department instances
	    Department dept1 = new Department(1, "Sales");
	    Department dept2 = new Department(2, "IT");
	    Department dept3 = new Department(3, "Accounting");
	    Department dept4 = new Department(4, "Marketing");

	    deptList.add(dept1);
	    deptList.add(dept2);
	    deptList.add(dept3);
	    deptList.add(dept4);

	    // Create Employee instances
	    Employee emp1 = new Employee(101, "Eman ", "MUSCAT", 'F', dept1, 5000);
	    Employee emp2 = new Employee(102, "Sara", "MUSCAT", 'F', dept2, 75000);
	    Employee emp3 = new Employee(103, "Anwaar", "IBRI", 'F', dept1, 60000);
	    Employee emp4 = new Employee(104, "Jeanan", "MUSCAT", 'F', dept2, 85000);
	    // Create a list of employees
	    List<Employee> employees = new ArrayList<>();
	    employees.add(emp1);
	    employees.add(emp2);
	    employees.add(emp3);
	    employees.add(emp4);

		
		//to list all departments 
		deptList.stream().map(dept -> dept.getDeptName()).forEach(d -> System.out.println(d));
		System.out.println();
		// OR 
		deptList.stream().map(Department :: getDeptName).forEach(System.out :: println);
		System.out.println();

		
		// Find the employee with the highest Salary and display 
		 Optional<Employee> highestPaidEmployee = employees.stream()
	                							.max(Comparator.comparing(Employee::getSalary));

	     highestPaidEmployee.ifPresent(System.out::println);
		 System.out.println();

	     // Find Employee count in every department & display 
	 	// Find the employee with the highest Salary and display 
	     Map<String, Long> employeeCountByDept = employees.stream()
	    		 								.collect(Collectors.groupingBy( emp -> emp.getEmpDept().getDeptName(), Collectors.counting() ) );
	     
	     System.out.println("Employee in Each Department");
	     employeeCountByDept.forEach((dept, count) -> System.out.println(dept + ": " + count));
		
		 
	}

}
