package com.test.indiabix.javaclass;

public class Test125 {
	public static void main(String[] args) {
		int i = 1, j = 10;
		do {
			if (i++ > --j) /* Line 4 */
			{
				continue;
			}
		} while (i < 5);
		System.out.println("i = " + i + "and j = " + j);
	}

}
