package com.test.hfdp.adapter;

public class DuckAdapter implements Turkey {
	Duck duck;
	
	public DuckAdapter(Duck duck) {
		this.duck = duck;
	}

	@Override
	public void fly() {
		duck.fly();
	}

	@Override
	public void qobble() {
		duck.quack();
	}

}
