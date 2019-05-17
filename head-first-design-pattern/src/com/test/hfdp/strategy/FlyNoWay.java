package com.test.hfdp.strategy;

public class FlyNoWay implements FlyBehaviour {

	@Override
	public void fly() {
		System.out.println("can't fly");
	}

}
