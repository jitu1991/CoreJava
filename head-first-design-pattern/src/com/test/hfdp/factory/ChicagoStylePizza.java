package com.test.hfdp.factory;

public class ChicagoStylePizza extends Pizza {
	public void prepare() {
		System.out.println("Preparing Chicago style pizza");
	}

	public void bake() {
		System.out.println("Baking Chicago style pizza");
	}

	public void cut() {
		System.out.println("Cutting Chicago style pizza");
	}

	public void pack() {
		System.out.println("Packing Chicago style pizza");
	}
}
