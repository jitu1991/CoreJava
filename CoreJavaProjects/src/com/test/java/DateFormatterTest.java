package com.test.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;

public class DateFormatterTest {
	public static void main(String[] args) throws ParseException {
		
		//System.out.println(22 == new Integer(22));
	/*String pattern = "MMM-dd-YYYY";
	SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

	String date = simpleDateFormat.format(System.currentTimeMillis());
	System.out.println(date);*/
		
		String date = "2018~3~0~15~0~Daily";
		System.out.println(date.substring(0, date.indexOf("Daily")));
		Date simpleDateFormat = new SimpleDateFormat("yyyy~MM~0~dd~0~").parse(date);
		System.out.println(simpleDateFormat);
		
		/*String pattern = "MMM-dd-YYYY";
		SimpleDateFormat newFormat = new SimpleDateFormat(pattern);
		String formattedDate = newFormat.format(simpleDateFormat);
		System.out.println(formattedDate);
		
		Date date1 = new SimpleDateFormat("MM").parse("05");
		System.out.println(date1);
		Date date2 = new SimpleDateFormat("MM").parse("04");
		Date date3 = new SimpleDateFormat("MM").parse("02");
		Date date4 = new SimpleDateFormat("MM").parse("11");*/
		
		/*System.out.println("20190401".substring(4,6));
		System.out.println(new SimpleDateFormat("MMM").format(date1));*/
		
		/*TreeSet<Date> dates = new TreeSet<>(new Comparator<T>() {
		});
		dates.add(date1);
		dates.add(date2);
		dates.add(date3);
		dates.add(date4);*/
		//System.out.println(dates);
		
		/*Employee emp1 = new Employee("a", date1);
		Employee emp2 = new Employee("b", date2);
		Employee emp3 = new Employee("d", date3);
		Employee emp4 = new Employee("c", date4);
		
		TreeSet<Employee> dates = new TreeSet<>(new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getDate().compareTo(o2.getDate());
			}
		});
		
		dates.add(emp1);
		dates.add(emp2);
		dates.add(emp3);
		dates.add(emp4);
		
		System.out.println(dates);*/
		
		/*String pattern = "YYYY-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		Date date1 = simpleDateFormat.parse("2020-1-31");
		Date date2 = simpleDateFormat.parse("2020-12-31");
		System.out.println(date1);
		System.out.println(date2);*/
	}
}
