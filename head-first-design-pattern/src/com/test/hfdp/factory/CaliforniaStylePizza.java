package com.test.hfdp.factory;

public class CaliforniaStylePizza extends Pizza {
	public void prepare() {
		System.out.println("Preparing California style pizza");
	}

	public void bake() {
		System.out.println("Baking California style pizza");
	}

	public void cut() {
		System.out.println("Cutting California style pizza");
	}

	public void pack() {
		System.out.println("Packing California style pizza");
	}
}
