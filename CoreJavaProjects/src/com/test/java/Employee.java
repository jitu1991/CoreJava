package com.test.java;

import java.util.Date;

public class Employee { // implements Comparator{//Comparable{
	private int id;
	private String name;
	private Date date;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Employee(String name, Date date) {
		this.date = date;
		this.name = name;
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
	
	

/*@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		Employee e1 = (Employee) o;
		
		if(e1.id == this.id)
		return 0;
		else if(e1.id < this.id)
			return -1;
		else return 1;
		
		
	}*/
	
  /*  @Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		
		if(e1.id == e2.id)
		return 0;
		else if(e1.id < e2.id)
			return -1;
		else return 1;
	}*/
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int hashCode()
	{
		return id;
	}
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", date=" + date + "]";
	}

	public boolean equals( Object obj )
	{
		boolean flag = false;
		Employee emp = (Employee)obj;
		if( emp.id == id)
			flag = true;
		return flag;
	}
}
