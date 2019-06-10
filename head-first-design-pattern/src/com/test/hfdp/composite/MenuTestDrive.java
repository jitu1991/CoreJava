package com.test.hfdp.composite;

public class MenuTestDrive {
	public static void main(String[] args) {
		
		//System.out.println(null);
		
		//String a = new String(null);
		
		/*StringBuilder a = new  StringBuilder('A');
		a.append('B');
		a.append('C');
		a.append('D');*/

		
		MenuComponent allMenus = new Menu("ALL", "all menus");

		MenuComponent dinerMenu = new Menu("Diner", "Diner Menu");
		MenuComponent pancakeMenu = new Menu("Pancake house", "pancack Menu");
		MenuComponent cafeMenu = new Menu("Cafe", "Cafe Menu");
		MenuComponent dessertMenu = new Menu("Dessert", "Dessert Menu");

		dinerMenu.add(new MenuItem("Thali", 45.6));
		dinerMenu.add(new MenuItem("Chinese", 412.6));

		pancakeMenu.add(new MenuItem("Crossaint", 12.5));
		pancakeMenu.add(new MenuItem("Salad", 5.5));

		cafeMenu.add(new MenuItem("Tea", 15));
		cafeMenu.add(new MenuItem("Coffee", 12.25));

		dessertMenu.add(new MenuItem("Strawberry", 10.5));
		dessertMenu.add(new MenuItem("Chocolate", 15.5));

		cafeMenu.add(dessertMenu);

		allMenus.add(dinerMenu);
		allMenus.add(pancakeMenu);
		allMenus.add(cafeMenu);

		Waitress waitress = new Waitress(allMenus);
		waitress.print();
	}
}
