package com.test.concurrent;

public class PrintHelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		PrintHelloThread hello = new PrintHelloThread("Hello");
		PrintWorldThread world = new PrintWorldThread("World");

		
		new Thread(hello).start();
		new Thread(world).start();
		
	}

}
