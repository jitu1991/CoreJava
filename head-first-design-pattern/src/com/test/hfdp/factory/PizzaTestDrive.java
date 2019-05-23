package com.test.hfdp.factory;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore ny = new NYPizzaStore();
		PizzaStore ch = new ChicagoPizzaStore();
		
		Pizza pizza = ny.orderPizza("cheese");
		System.out.println("ordered: " + pizza.getName());
		
		pizza = ch.orderPizza("cheese");
		System.out.println("ordered: " + pizza.getName());

	}
}
