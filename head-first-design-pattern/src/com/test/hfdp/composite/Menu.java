package com.test.hfdp.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
	List<MenuComponent> components = new ArrayList<>();
	String name;
	String description;
	
	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public void add(MenuComponent menuComponent) {
		components.add(menuComponent);
	}
	
	public void remove(MenuComponent menuComponent) {
		components.remove(menuComponent);
	}
	
	public MenuComponent getChild(int i) {
		return components.get(i);
	}
	
	public void print() {
		System.out.println("" + getName() + " Description: "+ getDescription());
		Iterator<MenuComponent> iterator = components.iterator();
		while(iterator.hasNext()) {
			MenuComponent component = iterator.next();
			component.print();
		}
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	public Iterator createIterator() {
		return new CompositeIterator(components.iterator());
	}
}
