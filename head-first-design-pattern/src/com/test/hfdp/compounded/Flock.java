package com.test.hfdp.compounded;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Flock implements Quackable {

	List ducks = new ArrayList<>();

	public void add(Quackable quacker) {
		ducks.add(quacker);
	}

	public void quack() {
		Iterator iterator = ducks.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = (Quackable) iterator.next();
			quacker.quack();
		}
	}

	@Override
	public void registerObserver(Observer observer) {
		Iterator iterator = ducks.iterator();
		while(iterator.hasNext()) {
			Quackable duck = (Quackable) iterator.next();
			duck.registerObserver(observer);
		}
	}

	@Override
	public void notifyObservers() {
	}
}
