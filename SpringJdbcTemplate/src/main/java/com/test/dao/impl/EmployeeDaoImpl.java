package com.test.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.test.dao.EmployeeDao;
import com.test.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private DataSource datasource;
	Connection con = null;
	private String insertQuery = "INSERT INTO employee " + "(ID, NAME, deptid) VALUES (?, ?, ?)";
	private String selectQuery = "select * from employee where id = ?";

	public void setDatasource(DataSource dataSource) {
		this.datasource = dataSource;
	}

	public void insert(Employee employee) {

		try {
			con = datasource.getConnection();
			PreparedStatement ps = con.prepareStatement(insertQuery);
			ps.setInt(1, employee.getId());
			ps.setString(2, employee.getName());
			ps.setInt(3, employee.getDeptid());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public Employee findById(int id) {
		try {
			con = datasource.getConnection();
			PreparedStatement ps = con.prepareStatement(selectQuery);
			ps.setInt(1, id);
			Employee emp = null;
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				emp = new Employee(rs.getInt("id"), rs.getString("name"), rs.getInt("deptid"));
			}
			rs.close();
			ps.close();
			return emp;
		} catch (SQLException e) {
			throw new RuntimeException();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
