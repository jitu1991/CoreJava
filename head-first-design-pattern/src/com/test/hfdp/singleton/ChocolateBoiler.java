package com.test.hfdp.singleton;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler instance;
	
	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}
	
	public static ChocolateBoiler getInstance() {
		if(instance == null) {
			instance = new ChocolateBoiler();
			return instance;
		}
		return instance;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			// fill the liquid
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			empty = true;
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled())
			boiled = true;
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
