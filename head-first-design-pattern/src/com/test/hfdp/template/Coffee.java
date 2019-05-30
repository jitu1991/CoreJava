package com.test.hfdp.template;

public class Coffee extends CaffeineBeverage {

	@Override
	public void brew() {
		System.out.println("dripping through filter");
	}

	@Override
	public void addCondiments() {
		System.out.println("add sugar and milk");
	}

}
