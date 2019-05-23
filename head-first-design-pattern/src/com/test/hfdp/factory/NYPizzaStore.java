package com.test.hfdp.factory;

public class NYPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
		if(type == "cheese") {
			//pizza = new NYStylePizza();
			pizza = new CheesePizza(factory);
			pizza.setName("NY Style pizz");
		}
		return pizza;
	}

}
