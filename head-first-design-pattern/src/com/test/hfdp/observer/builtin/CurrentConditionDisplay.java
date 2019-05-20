package com.test.hfdp.observer.builtin;

import java.util.Observable;
import java.util.Observer;

import com.test.hfdp.observer.DisplayElement;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;

	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions - Temperature: " + temperature + " and humidity is: " + humidity);
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData data = (WeatherData) o;
			this.temperature = data.getTemperature();
			this.humidity = data.getHumidity();
			display();
		}
	}
}
