package com.test.pattern.decorator;

public class Rupee extends Currency {
	double value;

	public Rupee() {
		description = "indian rupees";
	}

	public double cost(double v) {
		value = v;
		return value;
	}

}
