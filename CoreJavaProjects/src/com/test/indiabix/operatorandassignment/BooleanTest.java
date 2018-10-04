package com.test.indiabix.operatorandassignment;

public class BooleanTest {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 & b2);
		System.out.println(b2 & b3);
		
		System.out.println(b1 & b2 | b2 & b3 | b2);
		
		if (b1 & b2 | b2 & b3 | b2) /* Line 8 */
			System.out.print("ok ");
		if (b1 & b2 | b2 & b3 | b2 | b1) /* Line 10 */
			System.out.println("dokey");
	}

}
