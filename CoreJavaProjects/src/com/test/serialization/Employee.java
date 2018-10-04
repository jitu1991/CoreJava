package com.test.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;

	transient public int empId;
	public String empName;
	transient public int salary;
	//public String password;
	
	@Override
	public String toString() {
		return "Employee { ID = "+empId+" name = "+empName+" Salary = "+salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
/*	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}*/

}
