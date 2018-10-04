package dbToExcel.com.test.excelconvertor;

import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DbToExcel {
	
	public static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
	public static final String MYSQL_CONNECTION_URL = "jdbc:mysql://localhost:3306/test";
	public static final String USER = "root";
	public static final String PASSWORD = "password@1";
	//public static final String SQL_QUERY = "select * from trade limit 0, 50";
	public static final String SQL_QUERY = "select * from trade";
	
	
	public static void main(String[] args) {
		try {
			
			//Configure db properties
			Class.forName(MYSQL_DRIVER);
			Connection con = DriverManager.getConnection(MYSQL_CONNECTION_URL, USER, PASSWORD);
			
			Statement stmt = con.createStatement();
			ResultSet resultSet = stmt.executeQuery(SQL_QUERY);
			
			//XSSFWorkbook workbook = new XSSFWorkbook();
			//XSSFSheet sheet = workbook.createSheet("tradeData");
			//XSSFWorkbook workbook = dumpHeader(resultSet);
			
			//Writing header
			
			long startTimeResultsetToExcel = System.currentTimeMillis();
			
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("trade");
		    XSSFRow titleRow = sheet.createRow(0);
		    ResultSetMetaData metaData = resultSet.getMetaData();
		    int columnCount = metaData.getColumnCount();
		    for (int colIndex = 0; colIndex < columnCount; colIndex++) {
		        String title = metaData.getColumnLabel(colIndex + 1);
		        XSSFCell cell = titleRow.createCell(colIndex);
		        cell.setCellValue(title);
		        
		    }
		    
		    //Write data
		    int currentRow = 1;
		    resultSet.beforeFirst();
		    while (resultSet.next()) {
		        XSSFRow row = sheet.createRow(currentRow++);
		        for (int colIndex = 0; colIndex < columnCount; colIndex++) {
		            Object value = resultSet.getObject(colIndex + 1);
		            System.out.println("----------" + value + "----------");
		            final XSSFCell cell = row.createCell(colIndex);
		            if (value == null) {
		                cell.setCellValue("");
		            } else {
		                if (value instanceof Integer) {
		                    cell.setCellValue((Integer) value);
		                } else if (value instanceof Double) {
		                    cell.setCellValue((Double) value);
		                } else if (value instanceof String) {
		                    cell.setCellValue((String) value);
		                } else if (value instanceof Date) {
		                    cell.setCellValue((Date) value);
		                } else if (value instanceof Time) {
		                    cell.setCellValue((Time) value);
		                }
		            }
		        }
		    }
		    
		    for (int i = 0; i < columnCount; i++) {
		        sheet.autoSizeColumn(i);
		    }
		    
		    //Writing to excel file
			FileOutputStream fileOut = new FileOutputStream("e:\\DbToExcel.xlsx");
	        workbook.write(fileOut);
	        
	        long endTimeResultsetToExcel = System.currentTimeMillis();
	        long totalTimeResultsetToExcel = endTimeResultsetToExcel - startTimeResultsetToExcel;
			System.out.println("Time from Resultset to Excel " + totalTimeResultsetToExcel);
	        
	        fileOut.close();

	        // Closing the workbook
	        workbook.close();
			
			//Creating workbook
			/*XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("tradeData");
			XSSFRow row = sheet.createRow(0);
			XSSFCell cell;
			
			cell = row.createCell(0);
			cell.setCellValue("Tradeid");

			cell = row.createCell(1);
			cell.setCellValue("TradePrice");
			
			cell = row.createCell(2);
			cell.setCellValue("Security");

			cell = row.createCell(3);
			cell.setCellValue("Instrument Type");
			
			cell = row.createCell(4);
			cell.setCellValue("TradeDate");
			
			cell = row.createCell(5);
			cell.setCellValue("TradeTime");
			
			cell = row.createCell(6);
			cell.setCellValue("Currency");
			
			cell = row.createCell(7);
			cell.setCellValue("Broker");
			
			cell = row.createCell(8);
			cell.setCellValue("Direction");

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
			con.close();*/
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}