package com.test.hfdp.factory;

public class VeggiePizza extends Pizza {
	public void prepare() {
		System.out.println("Preparing veggie pizza");
	}

	public void bake() {
		System.out.println("Baking veggie pizza");
	}

	public void cut() {
		System.out.println("Cutting veggie pizza");
	}

	public void pack() {
		System.out.println("Packing veggie pizza");
	}
}
