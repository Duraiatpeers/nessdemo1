package com.stackroute.hrproject;


// adding comment
public class Employee{
	
	private String empid;
	private String empname;
	private String location;
	
	public Employee() {
	
	}

	public Employee(String empid, String empname, String location) {
		this.empid = empid;
		this.empname = empname;
		this.location = location;
	}

	public String getEmpid() {
		return empid;
	}

	public void setEmpid(String empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", location=" + location + "]";
	}
	
	
	
	
	
	

}
