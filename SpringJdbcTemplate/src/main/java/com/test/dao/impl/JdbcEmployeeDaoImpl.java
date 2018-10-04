package com.test.dao.impl;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.test.dao.JdbcEmployeeDao;
import com.test.mapper.EmployeeRowMapper;
import com.test.model.Employee;

public class JdbcEmployeeDaoImpl implements JdbcEmployeeDao {
	private DataSource datasource;
	private JdbcTemplate jdbcTemplate;

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	public void insert(Employee employee) {
		String insertQuery = "insert into employee " + "(id, name, deptid) values (?,?,?)";
		jdbcTemplate = new JdbcTemplate(datasource);

		jdbcTemplate.update(insertQuery, new Object[] { employee.getId(), employee.getName(), employee.getDeptid() });
	}

	public Employee findById(int id) {
		String selectQuery = "select * from employee where id = ?";
		jdbcTemplate = new JdbcTemplate(datasource);
		Employee employee = (Employee) jdbcTemplate.queryForObject(selectQuery, new Object[] { id },
				new EmployeeRowMapper());
		return employee;
	}
}
