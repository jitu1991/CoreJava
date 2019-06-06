package com.test.hfdp.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class CafeMenu implements Menu {
	Hashtable menuItems = new Hashtable<>();
	
	public CafeMenu() {
		addItem("Burger", 45.6);
	}

	public void addItem(String name, double price) {
		MenuItem menuItem = new MenuItem(name, price);
		menuItems.put(menuItem.getName(), menuItem);
	}
	
	public Hashtable getItems() {
		return menuItems;
	}

	@Override
	public Iterator createIterator() {
		return menuItems.values().iterator();
	}
}
