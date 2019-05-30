package com.test.hfdp.template;

public abstract class CaffeineBeverageWithHook {
	public void prepareReceipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantCondiments()) {
			addCondiments();
		}
	}

	public abstract void brew();

	public abstract void addCondiments();

	public void boilWater() {
		System.out.println("water boiling");
	}

	public void pourInCup() {
		System.out.println("pouring in cup");
	}

	public boolean customerWantCondiments() {
		return true;
	}
}
