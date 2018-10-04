package com.test.pattern.decorator;

public class SGDDecorator extends Decorator {
	Currency currency;

	public SGDDecorator(Currency currency) {
		this.currency = currency;
	}

	public String getDescription() {
		return currency.getCurrencyDescription() + " ,its singapore Dollar";
	}

	@Override
	public double cost(double value) {
		// TODO Auto-generated method stub
		return 0;
	}

}
