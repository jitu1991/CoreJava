package com.test.hfdp.composite;

import java.util.Iterator;

public class Waitress {
	MenuComponent allMenu;

	public Waitress(MenuComponent allMenu) {
		this.allMenu = allMenu;
	}
	
	public void print() {
		allMenu.print();
	}
	
	public void printVegMenu() {
		Iterator iterator = allMenu.createIterator();
		System.out.println("VEG MENU");
		while(iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			try {
				if(menuComponent.isVeg()) {
					menuComponent.print();
				}
			} catch(UnsupportedOperationException w) {}
			
		}
	}
	
}
