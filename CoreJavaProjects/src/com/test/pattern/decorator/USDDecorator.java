package com.test.pattern.decorator;

public class USDDecorator extends Decorator {

	Currency currency;

	public USDDecorator(Currency currency) {
		this.currency = currency;
	}

	public String getDescription() {
		return currency.getCurrencyDescription() + " ,its US Dollar";
	}

	@Override
	public double cost(double value) {
		// TODO Auto-generated method stub
		return 0;
	}

}
