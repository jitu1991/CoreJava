package com.test.hfdp.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MenuTestDrive {
	public static void main(String[] args) {
		PancakeHouseMenu panMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		CafeMenu cafeMenu = new CafeMenu();
		
		panMenu.addItem("Pizza", 34.0);
		panMenu.addItem("Pasta", 12.0);
		
		dinerMenu.addItem("Thali", 300);
		dinerMenu.addItem("Dosa", 120);
		
		cafeMenu.addItem("Crossiant", 235);
		cafeMenu.addItem("Wedges", 110);
		
		List<Menu> menus = new ArrayList<>();
		menus.add(panMenu);
		menus.add(dinerMenu);
		menus.add(cafeMenu);

		Waitress waitress = new Waitress(menus);
		waitress.printMenu();
	}
}
