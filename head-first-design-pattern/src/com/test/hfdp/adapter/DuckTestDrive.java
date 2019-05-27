package com.test.hfdp.adapter;

public class DuckTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		WildTurkey turkey = new WildTurkey();
		
		TurkeyAdapter adapter = new TurkeyAdapter(turkey);
		
		System.out.println("Turkey says");
		turkey.qobble();
		turkey.fly();
		
		System.out.println("Duck says");
		testDuck(duck);
		
		System.out.println("the adapter says");
		testDuck(adapter);
	}
	
	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
