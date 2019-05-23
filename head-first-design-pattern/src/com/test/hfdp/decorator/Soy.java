package com.test.hfdp.decorator;

public class Soy extends CondimentDecorator {
	Beverage beverage;
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getSize() {
		return beverage.getSize();
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		//return beverage.cost() + .40;
		double cost = beverage.cost();
		if(getSize() == "Tall") {
			cost += .30;
		} else if(getSize() == "Medium") {
			cost += .25;
		} else if(getSize() == "Small") {
			cost += .20;
		}
		return cost;
	}
}
