package com.test.pattern.decorator;

public class Doller extends Currency {
	double value;

	public Doller () {
		description = "Dollar";
 }

	public double cost(double v) {
		value = v;

		return value;

	}

}
