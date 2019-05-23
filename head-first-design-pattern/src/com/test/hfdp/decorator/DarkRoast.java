package com.test.hfdp.decorator;

public class DarkRoast extends Beverage {

	public DarkRoast() {
		description = "Dark Roast";
	}
	
	@Override
	public double cost() {
		return .11;
	}
	
}
