package com.test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchSizeWithJdbc {
	public static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
	public static final String MYSQL_CONNECTION_URL = "jdbc:mysql://localhost:3306/test";
	public static final String USER = "root";
	public static final String PASSWORD = "password@1";
	public static final String SQL_QUERY = "select * from trade limit 0, 350000";

	public static void main(String[] args) {
		try {
			Class.forName(MYSQL_DRIVER);
			Connection con = DriverManager.getConnection(MYSQL_CONNECTION_URL, USER, PASSWORD);

			Statement stmt = con.createStatement();
			//stmt.setFetchSize(100000);
			
			long startTime = System.currentTimeMillis();
			ResultSet resultSet = stmt.executeQuery(SQL_QUERY);
			long endTime = System.currentTimeMillis();

			long totalTime = endTime -  startTime;
			int i = 0;
			while (resultSet.next()) {
				System.out.println(resultSet.getString("tradeid"));
				++i;
			}
			
			System.out.println("Nos " + i);
			System.out.println("Total time "+ totalTime);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
