package com.test.hfdp.iterator;

import java.util.ArrayList;
import java.util.List;

public class DinerMenu implements Menu {
	static final int MAX = 10;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public DinerMenu() {
		menuItems  = new MenuItem[MAX];
	}
	
	public java.util.Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
	
	public void addItem(String name, double price) {
		MenuItem menuItem = new MenuItem(name, price);
		if(numberOfItems >= MAX) {
			System.err.println("Cannot add");
		} else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems++;
		}
	}
}
