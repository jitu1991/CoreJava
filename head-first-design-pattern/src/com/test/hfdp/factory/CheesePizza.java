package com.test.hfdp.factory;

public class CheesePizza extends Pizza {
	PizzaIngredientFactory factory;
	
	public CheesePizza(PizzaIngredientFactory factory) {
		this.factory = factory;
	}

	@Override
	public void prepare() {
		System.out.println("preparing...");
		factory.createDough();
		factory.createCheese();
		factory.createSauce();
	}
}
