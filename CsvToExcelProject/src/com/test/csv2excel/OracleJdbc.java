package com.test.csv2excel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import oracle.jdbc.driver.*;
import oracle.jdbc.internal.OracleStatement;


public class OracleJdbc {
	public static final String selectQuery = "select * from trade";
	
	public static void main(String[] args) {
		try {
			Class.forName(OracleConnection.DRIVER);
			Connection connection = null;
			connection = DriverManager.getConnection(OracleConnection.URL, OracleConnection.USER, OracleConnection.PASSWORD);
			
			//PreparedStatement stmt = connection.prepareStatement(selectQuery);
			//stmt.setInt(1, 3482);
			
			Statement stmt = connection.createStatement();
			
			long startTime = System.currentTimeMillis();
			ResultSet rs = stmt.executeQuery(selectQuery);
			long endTime = System.currentTimeMillis();
			
			System.out.println("Total Time in execution " + (endTime - startTime));
			
			/*while(rs.next()) {
				System.out.println(rs.getString("security"));
			}*/

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
