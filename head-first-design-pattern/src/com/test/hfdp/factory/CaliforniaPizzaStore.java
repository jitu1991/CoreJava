package com.test.hfdp.factory;

public class CaliforniaPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		if(type == "cheese") {
			pizza = new CaliforniaStylePizza();
		}
		return pizza;
	}

}
