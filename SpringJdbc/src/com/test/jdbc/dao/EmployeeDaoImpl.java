package com.test.jdbc.dao;

import javax.sql.DataSource;

import com.test.jdbc.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void insertEmployee(Employee emp) {

		String query = "insert into employee (name,salary,dept) values (?,?,?)";
		jdbcTemplate = new JdbcTemplate(dataSource);
		Object[] inputs = new Object[] { emp.getName(), emp.getSalary(), emp.getDept() };
		jdbcTemplate.update(query, inputs);
	}

	@Override
	public void insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}
}
