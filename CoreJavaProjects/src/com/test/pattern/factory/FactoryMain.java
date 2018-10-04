package com.test.pattern.factory;

public class FactoryMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OSFactory osf = new OSFactory();
		OS obj = osf.getInstance("Closed");
		obj.spec();
	}

}
