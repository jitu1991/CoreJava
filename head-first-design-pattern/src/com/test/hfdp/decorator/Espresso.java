package com.test.hfdp.decorator;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}
	
	@Override
	public double cost() {
		return 0.33;
	}
	
}
