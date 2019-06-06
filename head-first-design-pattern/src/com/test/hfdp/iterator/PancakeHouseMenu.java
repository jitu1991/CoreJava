package com.test.hfdp.iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu implements Menu {
	List menuItems;
	
	public PancakeHouseMenu() {
		menuItems = new ArrayList<>();
	}
	
	public java.util.Iterator createIterator() {
		//Just to write custom iterator
		//return new PancakeHouseMenuIterator(menuItems);
		return menuItems.iterator();
	}
	
	public void addItem(String name, double price) {
		MenuItem menuItem = new MenuItem(name, price);
		menuItems.add(menuItem);
	}
}
