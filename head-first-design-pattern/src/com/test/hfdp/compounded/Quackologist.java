package com.test.hfdp.compounded;

public class Quackologist implements Observer {

	@Override
	public void update(QuackObservable duck) {
		System.out.println("quackologist: " + duck + "just quacked");
	}
}
