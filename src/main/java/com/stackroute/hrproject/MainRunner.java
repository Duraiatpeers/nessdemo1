package com.stackroute.hrproject;

public class MainRunner {

	
	
	public static void main(String[] args) {
		
		EmployeeService eservice = new EmployeeService();
		
		Employee emp1 = new Employee("e001","Iniyal","Trivandrum");
		Employee emp2 = new Employee("e002","Chris","Bangalore");
		Employee emp3 = new Employee("e003","Sam","Mumbai");
		
		eservice.addEmployee(emp1);
		eservice.addEmployee(emp2);
		eservice.addEmployee(emp3);
		
		eservice.getAllEmployees().forEach((s) -> { System.out.println(s.getEmpname() + " " + s.getLocation());});
		
		
	}

	
	
}
