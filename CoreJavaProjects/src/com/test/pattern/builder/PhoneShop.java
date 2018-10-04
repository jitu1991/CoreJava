package com.test.pattern.builder;

public class PhoneShop {
	
	public static void main(String[] args) {
		
		//Phone ph = new Phone("Android", 2, "Mediatek", 5.5, 3100);
		
		Phone ph = new PhoneBuilder().setBattery(4000).setRam(4).getPhone();
		System.out.println(ph);
		
	}

}
