package com.test.metro;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class FareStrategyFactory {
	WeekdayFareStrategy weekday = new WeekdayFareStrategy();
	WeekendFareStrategy weekend = new WeekendFareStrategy();
	
	public FareStrategy getFareStrategy(LocalDateTime date) {
		if(date.getDayOfWeek() == DayOfWeek.SATURDAY || date.getDayOfWeek() == DayOfWeek.SUNDAY) {
			return weekend;
		} else {
			return weekday;
		}
	}
}
