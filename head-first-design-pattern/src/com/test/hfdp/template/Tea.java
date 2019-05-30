package com.test.hfdp.template;

public class Tea extends CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("steeping the tea");
	}

	@Override
	public void addCondiments() {
		System.out.println("add lemon");
	}

}
