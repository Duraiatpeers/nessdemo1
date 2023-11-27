package com.stackroute.hrproject;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	
	public List<Employee> emplist;
	
	public EmployeeService() {
		emplist = new ArrayList<>();
	}
	
	public Employee addEmployee(Employee newemp) {
		emplist.add(newemp);
		return newemp;
//		return null;
	}
	
	public List<Employee> getAllEmployees() {
		return emplist;
	}
	
	

}
