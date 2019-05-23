package com.test.hfdp.decorator;

public class HouseBlend extends Beverage {

	public HouseBlend() {
		description = "House Blend";
	}
	
	@Override
	public double cost() {
		return .44;
	}
	
}
