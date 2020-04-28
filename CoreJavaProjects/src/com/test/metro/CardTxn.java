package com.test.metro;

public class CardTxn {
	int id;
	
	Stations source;
	Stations destination;
	
	int distance;
	
	double balance;
	double fare;
	FareStrategy fareStrategyUsed;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Stations getSource() {
		return source;
	}
	public void setSource(Stations source) {
		this.source = source;
	}
	public Stations getDestination() {
		return destination;
	}
	public void setDestination(Stations destination) {
		this.destination = destination;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public FareStrategy getFareStrategyUsed() {
		return fareStrategyUsed;
	}
	public void setFareStrategyUsed(FareStrategy fareStrategyUsed) {
		this.fareStrategyUsed = fareStrategyUsed;
	}
}
