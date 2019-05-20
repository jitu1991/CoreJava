package com.test.hfdp.observer;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData data = new WeatherData();
		CurrentConditionDisplay curDisplay = new CurrentConditionDisplay(data);
		StatisticalDisplay statDisplay = new StatisticalDisplay(data);
		ForecastDisplay forDisplay = new ForecastDisplay(data);
		HeatIndexDisplay heatDisplay = new HeatIndexDisplay(data);
		
		data.setMeasurements(45, 66, 34);
		data.setMeasurements(1, 4, 5);
		data.setMeasurements(34, 67, 88);
	}
}
