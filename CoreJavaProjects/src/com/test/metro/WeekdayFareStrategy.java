package com.test.metro;

public class WeekdayFareStrategy implements FareStrategy {

	@Override
	public String getName() {
		return WeekdayFareStrategy.class.toGenericString();
	}

	@Override
	public double getFarePerStation() {
		return 7.0;
	}

}
