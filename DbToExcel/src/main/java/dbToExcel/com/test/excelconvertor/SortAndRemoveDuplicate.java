package dbToExcel.com.test.excelconvertor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortAndRemoveDuplicate {
	public static final String MYSQL_DRIVER = "com.mysql.jdbc.Driver";
	public static final String MYSQL_CONNECTION_URL = "jdbc:mysql://localhost:3306/test";
	public static final String USER = "root";
	public static final String PASSWORD = "password@1";
	public static final String SQL_QUERY = "select * from trade";

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
		Set<Trade> tradeSet = new HashSet<>();
		Class.forName(MYSQL_DRIVER);
		Connection con = DriverManager.getConnection(MYSQL_CONNECTION_URL, USER, PASSWORD);

		Statement stmt = con.createStatement();
		ResultSet resultSet = stmt.executeQuery(SQL_QUERY);

		long startTime = System.currentTimeMillis();

		while (resultSet.next()) {
			Trade trade = new Trade();
			trade.setTradeId(resultSet.getInt("tradeid"));
			tradeSet.add(trade);
		}
		
		List<Trade> tradeList = new ArrayList<>(tradeSet);
		
		Collections.sort(tradeList, new IdComparator());
		//java.util.List<Trade> uniqueEmployee = tradeList.stream().distinct().collect(Collectors.toList());
		//Set<Trade> set = new LinkedHashSet<>(tradeList);
		
		//tradeList = new ArrayList<>(set);
		
		String fileName ="e:\\trade.txt";
		FileWriter fw = new FileWriter(fileName);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(Trade trade : tradeList) {
			bw.write(String.valueOf(trade.getTradeId() + "\n"));
		}
		System.out.println("Done");
		bw.close();
		fw.close();
		
	}
}
