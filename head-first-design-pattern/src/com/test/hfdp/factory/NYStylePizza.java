package com.test.hfdp.factory;

public class NYStylePizza extends Pizza {
	public void prepare() {
		System.out.println("Preparing non veggie pizza");
	}

	public void bake() {
		System.out.println("Baking non veggie pizza");
	}

	public void cut() {
		System.out.println("Cutting non veggie pizza");
	}

	public void pack() {
		System.out.println("Packing non veggie pizza");
	}
}
