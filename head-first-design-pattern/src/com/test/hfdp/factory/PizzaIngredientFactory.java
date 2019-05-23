package com.test.hfdp.factory;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	//public Veggies[] createVeggies();
}
