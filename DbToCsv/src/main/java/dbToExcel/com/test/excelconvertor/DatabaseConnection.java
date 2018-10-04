package dbToExcel.com.test.excelconvertor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
	
	public static final String driver = "com.mysql.jdbc.Driver";
	public static final String url = "jdbc:mysql://localhost:3306/test";
	public static final String username = "root";
	public static final String password= "password@1";

	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String SQL = "";

	public void CreateConnection() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
			System.out.println("Exception getting connection.");
			e.printStackTrace();
		}
	}

	public ResultSet getData() {
		try {
			SQL = "SELECT * FROM trade";
			stmt = con.createStatement();
			rs = stmt.executeQuery(SQL);
		} catch (SQLException s) {
			s.printStackTrace();
		}
		return rs;
	}

	public void closeConnections() throws SQLException {
		try {
			//con.commit();
		} catch (Exception e) {
			System.out.println("Exception while commit the connection.." + e);
		}

		if (rs != null) {
			rs.close();
			rs = null;
		}

		if (stmt != null) {
			stmt.close();
			stmt = null;
		}

		if (pstmt != null) {
			pstmt.close();
			pstmt = null;
		}
		if (con != null) {
			con.close();
			con = null;
		}
	}
}