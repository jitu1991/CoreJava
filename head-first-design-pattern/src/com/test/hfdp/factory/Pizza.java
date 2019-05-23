package com.test.hfdp.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	List toppings = new ArrayList<>();
	
	/*public void prepare() {
		System.out.println("preparing: " + name);
		System.out.println("baking");
		System.out.println("Adding sauce");
		System.out.println("Adding toppings");
		for(int i = 0; i < toppings.size(); i++) {
			System.out.println("Toppings are: " + toppings.get(i));
		}
	}*/
	
	public abstract void prepare();
	public void bake() {
		System.out.println("baking");
	}
	public void cut() {
		System.out.println("Cutting");
	}
	public void pack() {
		System.out.println("packing");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDough() {
		return dough;
	}
	public void setDough(String dough) {
		this.dough = dough;
	}
	public String getSauce() {
		return sauce;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public List getToppings() {
		return toppings;
	}
	public void setToppings(List toppings) {
		this.toppings = toppings;
	}
	
	
}
