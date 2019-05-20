package com.test.hfdp.observer.builtin;

import java.util.Observable;
import java.util.Observer;

import com.test.hfdp.observer.DisplayElement;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.2f;
	private float lastPressure;
	Observable observable;
	
	public ForecastDisplay(Observable observable) {
		WeatherData data = (WeatherData) observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Forecaset - current pressure: " + currentPressure);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData) {
			lastPressure = currentPressure;
			//currentPressure = weatherData.getpressure();
			display();
		}
	}

}
