package com.test.dao;

import com.test.model.Employee;

public interface EmployeeDao {
	public void insert(Employee employee);
	public Employee findById(int id);
}
