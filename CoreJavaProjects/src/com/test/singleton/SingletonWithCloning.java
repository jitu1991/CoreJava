package com.test.singleton;

public class SingletonWithCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Singleton instance1 = Singleton.instance;
		//Singleton instance2 = (Singleton) instance1.clone();
		
		System.out.println(instance1.hashCode());
		//System.out.println(instance2.hashCode());
	}
}
