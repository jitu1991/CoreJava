package com.test.model;

public class Employee {
	private int id;
	private String name;
	private int deptid;

	
	
	public Employee() {
	}

	public Employee(int id, String name, int deptid) {
		this.id = id;
		this.name = name;
		this.deptid = deptid;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	
	@Override
	    public String toString() {
	        return "Employee [id= "+ id + ", name= "+ name + ", deptid= "+ deptid+"]";
	    }
}
