package com.test.hfdp.factory;

public class SimplePizzaFactory {
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type == "veg") {
			pizza = new VeggiePizza();
		} else if (type == "nonveg") {
			pizza = new NonVeggiePizza();
		}
		return pizza;
	}
}
