package dbToExcel.com.test.excelconvertor;

import java.io.FileWriter;
import java.sql.ResultSet;

import com.aspose.cells.SaveFormat;
import com.opencsv.CSVWriter;

public class ResultsetToCsvToExcel {
	public static void main(String args[]) throws Exception {
		String csvFilename = "e:\\TestData.csv";
		try {

			// Resultset to CSV
			DatabaseConnection dbcon = new DatabaseConnection();
			CSVWriter writer = new CSVWriter(new FileWriter(csvFilename));
			String[] header = "Tradeid,TradePrice,Security,Instrument Type,TradeDate,TradeTime,Currency,Broker,Direction"
					.split(",");
			writer.writeNext(header);
			dbcon.CreateConnection();

			long startTimeRsToCsv = System.currentTimeMillis();
			ResultSet rs = dbcon.getData();
			writer.writeAll(rs, false); // And the second argument is boolean which represents whether you want to write
										// header columns (table column names) to file or not.
			long endTimeRsToCsv = System.currentTimeMillis();

			long totalTimeRsToCsv = endTimeRsToCsv - startTimeRsToCsv;
			System.out.println("Time from ResultSet to CSV " + totalTimeRsToCsv);

			writer.close();
			dbcon.closeConnections();
			System.out.println("CSV file created succesfully.");
		} catch (Exception e) {
			System.out.println("exception :" + e.getMessage());
		}

		// CSV To excel

		// Load your sample CSV file inside the Workbook object.
		com.aspose.cells.Workbook wb = new com.aspose.cells.Workbook(csvFilename);

		// csv to xls format

		long startTimeCsvToExcel = System.currentTimeMillis();

		wb.save("e:\\SampleCSV_Excel.xlsx", SaveFormat.XLSX);

		long endTimeCsvToExcel = System.currentTimeMillis();

		long totalTimeCsvToExcel = endTimeCsvToExcel - startTimeCsvToExcel;
		System.out.println("Time from CSV to Excel " + totalTimeCsvToExcel);

		// String excelFile = dirPath + "SampleCSV_Excel.xlsx";
		// System.out.println(removeSheetFromExcel(excelFile));
	}
}
