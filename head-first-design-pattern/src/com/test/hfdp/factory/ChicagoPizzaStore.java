package com.test.hfdp.factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type == "cheese") {
			pizza = new ChicagoStylePizza();
		}
		return pizza;
	}

}
