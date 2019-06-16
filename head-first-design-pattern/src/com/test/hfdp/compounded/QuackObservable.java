package com.test.hfdp.compounded;


public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
