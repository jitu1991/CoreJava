package com.test.hfdp.template;

public abstract class CaffeineBeverage {
	public abstract void brew();
	public abstract void addCondiments();
	
	public void boilWater() {
		System.out.println("water boiling");
	}
	
	public void pourInCup() {
		System.out.println("pouring in cup");
	}
}
