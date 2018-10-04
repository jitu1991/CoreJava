package dbToExcel.com.test.excelconvertor;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DbToCsv {
	
	public static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
	public static final String MYSQL_CONNECTION_URL = "jdbc:mysql://localhost:3306/test";
	public static final String USER = "root";
	public static final String PASSWORD = "password@1";
	public static final String SQL_QUERY = "select * from employee";
	
	
	public static void main(String[] args) {
		try {
			
			//Configure db properties
			Class.forName(MYSQL_DRIVER);
			Connection con = DriverManager.getConnection(MYSQL_CONNECTION_URL, USER, PASSWORD);
			
			Statement stmt = con.createStatement();
			ResultSet resultSet = stmt.executeQuery(SQL_QUERY);
			
			//Creating workbook
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("employedb");
			XSSFRow row = sheet.createRow(0);
			XSSFCell cell;
			
			cell = row.createCell(0);
			cell.setCellValue("id");
			cell = row.createCell(1);
			cell.setCellValue("name");
			cell = row.createCell(2);
			cell.setCellValue("deptid");

			int i = 1;
			while (resultSet.next()) {
				row = sheet.createRow(i);
				cell = row.createCell(0);
				cell.setCellValue(resultSet.getInt("id"));
				cell = row.createCell(1);
				cell.setCellValue(resultSet.getString("name"));
				cell = row.createCell(2);
				cell.setCellValue(resultSet.getInt("deptid"));
				i++;
			}
			
			//Writing to excel
			FileOutputStream out = new FileOutputStream(new File("e:\\excelDatabase.xlsx"));
			workbook.write(out);
			out.close();
			System.out.println("File Successfully created");
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}