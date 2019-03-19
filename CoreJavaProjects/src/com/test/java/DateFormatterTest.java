package com.test.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatterTest {
	public static void main(String[] args) throws ParseException {
	/*String pattern = "MMM-dd-YYYY";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

	String date = simpleDateFormat.format(System.currentTimeMillis());
	System.out.println(date);*/
		
		String date = "20180312";
		Date simpleDateFormat = new SimpleDateFormat("yyyyMMdd").parse(date);
		System.out.println(simpleDateFormat);
		
		String pattern = "MMM-dd-YYYY";
		SimpleDateFormat newFormat = new SimpleDateFormat(pattern);
		String formattedDate = newFormat.format(simpleDateFormat);
		System.out.println(formattedDate);
	}
}
