package com.test.hfdp.decorator;

public class Decaf extends Beverage {

	public Decaf() {
		description = "Decaf";
	}
	
	@Override
	public double cost() {
		return 0.22;
	}
	
}
