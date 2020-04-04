package com.test.interview;

enum Trading {
	ALL("ALL_TRAD", "all"),
	MTM("MTM_TRAD", "mtm");

	private String name;
	private String code;
	
	private Trading(String name, String code) {
		this.name = name;
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}

enum Singleton {
	one;
}

enum Currency {
	PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
	private int value;
	
	private Currency (int value) {
		this.value = value;
	}
	
	public void display() {
		System.out.println("Inside enum");
	}
	
	@Override
	public String toString() {
		switch(this) {
		case PENNY:
			System.out.println("Penny: "+value);
			break;
		case DIME:
			System.out.println("Dime: "+value);
			break;
		case NICKLE:
			System.out.println("Nickle: "+value);
			break;
		case QUARTER:
			System.out.println("Quarter: "+value);
			break;
		}
		return super.toString();
	}
};

public class EnumTest {
	public static void main(String[] args) {
		//System.out.println(Currency.DIME);
		Singleton sin = Singleton.one;
		//Iterating enum
		for(Currency coin : Currency.values()) {
			//System.out.println(coin);
		}
		
		Currency coin = Currency.NICKLE;
		System.out.println(coin);
		
		coin.display();
		
		System.out.println(Trading.MTM.getName());
	}
}
