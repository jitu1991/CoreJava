package com.test.interview;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		/*Random r = new Random();
		int low = 1;
		int high = 5;
		System.out.println(r.nextInt(high-low) + high);*/
		
		double d = Math.round ( 2.5 + Math.random() );
		System.out.println(d);
		System.out.println(Math.abs(-5));
		System.out.println(Math.abs(5.0));
		System.out.println(Math.abs(5.0F));
		System.out.println(Math.abs(5L));
		
	}

}
