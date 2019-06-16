package com.test.hfdp.compounded;

public class ReadheadDuck implements Quackable {
	Observable observable;

	public ReadheadDuck() {
		observable = new Observable(this);
	}

	@Override
	public void quack() {
		System.out.println("quack");
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

}
