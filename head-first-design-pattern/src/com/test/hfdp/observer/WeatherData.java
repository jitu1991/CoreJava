package com.test.hfdp.observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private double temprature;
	private double humidity;
	private double pressure;
	private ArrayList observers;

	public WeatherData() {
		observers = new ArrayList<>();
	}

	public double getTemprature() {
		return temprature;
	}

	public double getHumidity() {
		return humidity;
	}

	public double getPressure() {
		return pressure;
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int indexOf = observers.indexOf(o);
		if (indexOf >= 0) {
			observers.remove(indexOf);
		}
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temprature, humidity, pressure);
		}
	}

	public void measurementsChanged() {
		notifyObserver();
	}

	public void setMeasurements(double temp, double humidity, double pressure) {
		this.temprature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
