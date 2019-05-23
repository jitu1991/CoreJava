package com.test.hfdp.decorator;

public abstract class Beverage {
	String description = "Unknown";
	
	//Adding size as new requirement
	String size ="Unknown";
	
	public String getDescription() {
		return description;
	}

	public String getSize() {
		return size;
	}

	public abstract double cost();
}
