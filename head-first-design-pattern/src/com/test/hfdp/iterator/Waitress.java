package com.test.hfdp.iterator;

import java.util.Iterator;
import java.util.List;

public class Waitress {
	List<Menu> menus;

	public Waitress(List<Menu> menus) {
		this.menus = menus;
	}
	
	public void printMenu() {
		Iterator<Menu> menuIterator = menus.iterator();
		while(menuIterator.hasNext()) {
			Menu menu = menuIterator.next();
			printMenu(menu.createIterator());
		}
	}
	
	/*Menu dinerMenu = new DinerMenu();
	Menu pancakeHouseMenu = new PancakeHouseMenu();
	Menu cafeMenu = new CafeMenu();
	
	public Waitress(Menu dinerMenu, Menu pancakeHouseMenu, Menu cafeMenu) {
		this.dinerMenu = dinerMenu;
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.cafeMenu = cafeMenu;
	}
	
	public void printMenu() {
		java.util.Iterator dinerMenuIterator = dinerMenu.createIterator();
		java.util.Iterator pancakeHouseIterator = pancakeHouseMenu.createIterator();
		java.util.Iterator cafeIterator = cafeMenu.createIterator();
		printMenu(pancakeHouseIterator);
		printMenu(dinerMenuIterator);
		printMenu(cafeIterator);
	}*/
	
	public void printMenu(java.util.Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem menuItem = (MenuItem) iterator.next();
			System.out.println(menuItem.getName() + "-->" + menuItem.getPrice());
		}
	}
}
