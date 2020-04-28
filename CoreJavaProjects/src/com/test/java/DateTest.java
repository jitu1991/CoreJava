package com.test.java;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		
		int i = 1;
		String s = 0 + "" + i;
		System.out.println(Integer.valueOf(s));
		
		//LocalDate today = LocalDate.now();
		String s1 = 111+""+22;
		int parseInt = Integer.valueOf(s);
		System.out.println(parseInt);
		LocalDate today = LocalDate.of(2020,1,31);
		LocalDate earlier = today.minusMonths(1);
		
		
		LocalDate endOfMonth = earlier.with( TemporalAdjusters.lastDayOfMonth());
		System.out.println(getLastWorkingDayOfMonth(endOfMonth));
		System.out.println(earlier);
	}
	
	public static LocalDate getLastWorkingDayOfMonth(LocalDate lastDayOfMonth) {
		LocalDate lastWorkingDayofMonth;
		   switch (DayOfWeek.of(lastDayOfMonth.get(ChronoField.DAY_OF_WEEK))) {
		     case SATURDAY:
		       lastWorkingDayofMonth = lastDayOfMonth.minusDays(1);
		       break;
		     case SUNDAY:
		       lastWorkingDayofMonth = lastDayOfMonth.minusDays(2);
		       break;
		     default:
		       lastWorkingDayofMonth = lastDayOfMonth;
		   }
		   return lastWorkingDayofMonth;
		 }
}
