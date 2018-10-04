package com.test.csv2excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.aspose.cells.SaveFormat;

public class CsvToExcel {
	public static void main(String[] args) throws Exception {
		// Directory path for input and output files.
		String dirPath = "E:\\csvToExcel\\";

		// Load your sample CSV file inside the Workbook object.
		com.aspose.cells.Workbook wb = new com.aspose.cells.Workbook(dirPath + "SampleCSV.csv");

		// Save CSV file to XLS format.
		// wb.save(dirPath + "outputConvertCSVToExcelFormats.xls",
		// SaveFormat.EXCEL_97_TO_2003);
		
		//csv to xls format
		
		long startTime = System.currentTimeMillis();
		
		wb.save(dirPath + "SampleCSV_Excel.xlsx", SaveFormat.XLSX);

		long endTime  = System.currentTimeMillis();
		
		long totalTime = endTime - startTime;
		System.out.println(totalTime);
		
		//csv to xlsx format
		//wb.save(dirPath + "outputConvertCSVToExcelFormats.xlsx", SaveFormat.XLSX);

		String excelFile = dirPath + "SampleCSV_Excel.xlsx";

		System.out.println(removeSheetFromExcel(excelFile));

	}

	private static String removeSheetFromExcel(String excelFile) throws IOException, InvalidFormatException {
		
		// Read Excel document first
		FileInputStream input_document = new FileInputStream(new File(excelFile));
        
		// Convert it into a POI object
        XSSFWorkbook workbook = new XSSFWorkbook(input_document); 
        
        // Read excel sheet that needs to be updated
        workbook.removeSheetAt(1);
        
        //important to close InputStream
        input_document.close();
        
        //Open FileOutputStream to write updates
        FileOutputStream output_file = new FileOutputStream(new File(excelFile));
        
        //write changes
        workbook.write(output_file);
        
        //close the stream
        output_file.close();
        return excelFile;
	}
}
