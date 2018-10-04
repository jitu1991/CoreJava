package com.test.indiabix.operatorandassignment;

public class BitShift {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 0x80000000;
        System.out.print(x + " and  ");
        x = x >>> 31;
        System.out.println(x);
	}

}
