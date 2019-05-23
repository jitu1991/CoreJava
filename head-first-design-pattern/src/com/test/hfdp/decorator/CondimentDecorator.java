package com.test.hfdp.decorator;

public abstract class CondimentDecorator extends Beverage {
	public abstract String getDescription();
	
	public abstract double cost();
}
