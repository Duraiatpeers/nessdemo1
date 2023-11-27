package com.stackroute.hrproject;

//import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class AEmployeeAppTest {

	static EmployeeService eservice;
	
	@BeforeTest
	public void inittest() {
		System.out.println("EmployeeAppTest - Init test - beforetest");
	}
	
	@BeforeSuite
	public void initsuite() {
		System.out.println("EmployeeAppTest - Init test - beforesuite");
	}
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		eservice = new EmployeeService();
	}


	@Test
	public void testEAddEmployee() {
		Employee emp1 = new Employee("e001","Iniyal","Trivandrum");
		Employee newempObj = eservice.addEmployee(emp1);
		
		assertEquals("e001",newempObj.getEmpid());
		assertEquals("Iniyal",newempObj.getEmpname());
		assertEquals("Trivandrum",newempObj.getLocation());
		
		assertTrue(false);
		
	}

	@Test
	public void testFgetAllEmployees() {
	
		Employee emp2 = new Employee("e002","Chris","Bangalore");
		Employee emp3 = new Employee("e003","Sam","Mumbai");
		
		eservice.addEmployee(emp2);
		eservice.addEmployee(emp3);
		
		List<Employee> emplist = eservice.getAllEmployees();
		
		assertTrue(emplist.size() == 3);
		assertTrue(emplist.get(0).getEmpid().equals("e001"));
		assertTrue(emplist.get(1).getEmpid().equals("e002"));
		assertTrue(emplist.get(2).getEmpid().equals("e003"));'
				assertTrue(emplist.size() == 3);
		assertTrue(emplist.size() == 5);
		assertEquals(1,2);			
	}
	
}

