package com.test.concurrent;

//Recreate threading issue during instantiation of Singleton class   
class Singleton {
	// 1. Make all constructors private
	private Singleton() {
	}

	// 2. Declare a private static variable to hold single instance of class
	private static SingletonThreadingTest INSTANCE = null;

	// 3. Declare a public static function that returns the single instance of
	// class
	public static SingletonThreadingTest getInstance() {
		

		if (INSTANCE == null) {
			synchronized (SingletonThreadingTest.class) {
				// Double check
				if (INSTANCE == null) {
					INSTANCE = new SingletonThreadingTest();
				}
			}
		}
		return INSTANCE;
	/*
		if (INSTANCE == null) {
			try {
				// If there is delay in creation of object then the threads
				// might create multiple instances
				Thread.sleep(10);
				INSTANCE = new Singleton();
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}
		return INSTANCE;
	*/}
}

public class SingletonThreadingTest implements Runnable {
	public void run() {
		System.out.println("Singleton instance id :" + Singleton.getInstance());
	}

	public static void main(String[] args) {
		System.out.println("Singleton Test!");
		SingletonThreadingTest sei1 = new SingletonThreadingTest();
		Thread thread1 = null;
		for (int i = 0; i < 2; i++) {
			thread1 = new Thread(sei1);
			// might create mutliple instances of Singleton class
			thread1.start();
		}
	}
}
