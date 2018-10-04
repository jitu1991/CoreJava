package dbToExcel.com.test.excelconvertor;

import java.io.FileWriter;
import java.sql.ResultSet;

import com.opencsv.CSVWriter;

public class ResultsetToCsvWriter {
	public static void main(String args[]) {
		String csvFilename = "e:\\TestData.csv";
		try {
			DatabaseConnection dbcon = new DatabaseConnection();
			CSVWriter writer = new CSVWriter(new FileWriter(csvFilename));
			//String[] header = "id,name,deptid".split(",");
			String[] header = "Tradeid,TradePrice,Security,Instrument Type,TradeDate,TradeTime,Currency,Broker,Direction".split(",");
			writer.writeNext(header);
			dbcon.CreateConnection();
			
			long startTime  = System.currentTimeMillis();
			ResultSet rs = dbcon.getData();
			writer.writeAll(rs, false); // And the second argument is boolean which represents whether you want to write
										// header columns (table column names) to file or not.
			long endTime  = System.currentTimeMillis();
			
			long totalTime = endTime - startTime;
			System.out.println(totalTime);
			
			writer.close();
			dbcon.closeConnections();
			System.out.println("CSV file created succesfully.");
		} catch (Exception e) {
			System.out.println("exception :" + e.getMessage());
		}
		
		
		// Directory path for input and output files.
		String dirPath = "e:\\";

		// Load your sample CSV file inside the Workbook object.
		//com.aspose.cells.Workbook wb = new com.aspose.cells.Workbook(dirPath + "sampleConvertCSVToExcelFormats.csv");

		// Save CSV file to XLS format.
		//wb.save(dirPath + "outputConvertCSVToExcelFormats.xls", SaveFormat.EXCEL_97_TO_2003);
		
	}
}
