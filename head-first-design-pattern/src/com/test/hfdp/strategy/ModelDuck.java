package com.test.hfdp.strategy;

public class ModelDuck extends Duck {

	public ModelDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("model duck");
	}

}
