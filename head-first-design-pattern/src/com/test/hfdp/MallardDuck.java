package com.test.hfdp;

public class MallardDuck extends Duck {

	public MallardDuck() {
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}
	
	@Override
	public void display() {
		System.out.println("Mallard Duck");
	}

}
