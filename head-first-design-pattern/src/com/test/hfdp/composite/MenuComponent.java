package com.test.hfdp.composite;

import java.util.Iterator;

public abstract class MenuComponent {
	public void add(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public void remove(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public MenuComponent getChild(int i) {
		throw new UnsupportedOperationException();
	}

	public String getName(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}

	public double getPrice(MenuComponent menuComponent) {
		throw new UnsupportedOperationException();
	}
	
	public boolean isVeg() {
		throw new UnsupportedOperationException();
	}

	public void print() {
		throw new UnsupportedOperationException();
	}
	
	public Iterator createIterator() {
		throw new UnsupportedOperationException();
	}
}
