package com.test.hfdp.factory;

/*public class PizzaStore {
	SimplePizzaFactory factory;
	
	public PizzaStore(SimplePizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza = factory.createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.pack();
		return pizza;
	}
}*/
public abstract class PizzaStore {
	public abstract Pizza createPizza(String type);
	
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.pack();
		return pizza;
	}
}