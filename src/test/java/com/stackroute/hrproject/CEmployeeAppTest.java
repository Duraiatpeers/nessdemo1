package com.stackroute.hrproject;

//import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;

public class CEmployeeAppTest {

	static EmployeeService eservice;
	
	@BeforeClass
	public static void setUpBeforeClass(){
		eservice = new EmployeeService();
		System.out.println("EmployeeAppTest3 - Before Class - Executed only once");	
	}

	@AfterClass
	public static void tearDownAfterClass(){
		System.out.println("EmployeeAppTest3 - AfterClass - Executed only once");
	}

	@BeforeMethod
	public void setUp() {
		System.out.println("EmployeeAppTest3 - Inside before method");
	}

	@AfterMethod
	public void tearDown(){
		System.out.println("EmployeeAppTest2 -  Inside after method");
	}

	@Test
	public void testAddEmployee() {
		Employee emp1 = new Employee("e001","Iniyal","Trivandrum");
		Employee newempObj = eservice.addEmployee(emp1);
		
		assertEquals("e001",newempObj.getEmpid());
		assertEquals("Iniyal",newempObj.getEmpname());
		assertEquals("Trivandrum",newempObj.getLocation());
			assertTrue(false);
		
	}

	@Test
	public void testBgetAllEmployees() {
	
		Employee emp2 = new Employee("e002","Chris","Bangalore");
		Employee emp3 = new Employee("e003","Sam","Mumbai");
		
		eservice.addEmployee(emp2);
		eservice.addEmployee(emp3);
		
		List<Employee> emplist = eservice.getAllEmployees();
		
		assertTrue(emplist.size() == 3);
		assertTrue(emplist.get(0).getEmpid().equals("e001"));
		assertTrue(emplist.get(1).getEmpid().equals("e002"));
		assertTrue(emplist.get(2).getEmpid().equals("e003"));
			
	}
	
}

// Arrange Act Assert
