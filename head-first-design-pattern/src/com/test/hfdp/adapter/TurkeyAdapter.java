package com.test.hfdp.adapter;

public class TurkeyAdapter implements Duck {
	Turkey turkey;
	
	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	@Override
	public void quack() {
		turkey.qobble();
	}

	@Override
	public void fly() {
		turkey.fly();
	}
	
}