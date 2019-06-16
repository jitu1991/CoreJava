package com.test.hfdp.compounded;

public class GooseAdaptor implements Quackable {
	Goose goose;
	Observable observable;
	
	public GooseAdaptor() {
		observable = new Observable(this);
	}

	public GooseAdaptor(Goose goose) {
		this.goose = goose;
	}

	@Override
	public void quack() {
		goose.honk();
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
