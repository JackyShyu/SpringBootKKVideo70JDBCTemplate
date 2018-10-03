package org.shyu.springboot.model;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String email;
	private double salary;
	
	public Employee(String employeeName, String email, double salary) {
		super();
		this.employeeName = employeeName;
		this.email = email;
		this.salary = salary;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
