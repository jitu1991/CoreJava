package com.test.hfdp.decorator;

public class StarbuzzCoffee {
	public static void main(String[] args) {
		Beverage bevarage = new DarkRoast();
		System.out.println(bevarage.getDescription() + "$" + bevarage.cost());
		
		Beverage bevarage2 = new Espresso();	//Make a espresso object
		bevarage2 = new Mocha(bevarage2);		//Wrap it in a Mocha object
		bevarage2 = new Soy(bevarage2);			//Wrap it in a Soy object
		bevarage2 = new Whip(bevarage2);		//Wrap it in a Whip object
		System.out.println(bevarage2.getDescription() + "$" + bevarage2.cost());
		
		Beverage bevarage3 = new HouseBlend();
		bevarage3 = new Mocha(bevarage3);
		bevarage3 = new Soy(bevarage3);
		bevarage3 = new Whip(bevarage3);
		System.out.println(bevarage3.getDescription() + "$" + bevarage3.cost());
	}
}
