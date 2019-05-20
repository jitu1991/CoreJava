package com.test.hfdp.observer;

public class HeatIndexDisplay implements DisplayElement, Observer {
	private double temprature;
	private double humidity;
	private Subject data;

	public HeatIndexDisplay(Subject data) {
		this.data = data;
		data.registerObserver(this);
	}
	@Override
	public void update(double temperature, double humidity, double pressure) {
		this.temprature = temperature;
		this.humidity = humidity;
		this.display();
	}

	@Override
	public void display() {
		System.out.println("heat index is : " + temprature*humidity*34);//Some random formula
	}
}
