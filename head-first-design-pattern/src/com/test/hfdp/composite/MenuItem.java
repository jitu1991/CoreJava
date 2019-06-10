package com.test.hfdp.composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
	private String name;
	private double price;
	
	public MenuItem(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void print() {
		System.out.println("" + getName() + " Price: "+ getPrice());
	}
	
	public Iterator createIterator() {
		return new NullIterator();
	}
}
