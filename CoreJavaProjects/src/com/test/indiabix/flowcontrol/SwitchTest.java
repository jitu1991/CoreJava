package com.test.indiabix.flowcontrol;

public class SwitchTest {
	final static short x = 2;
	public static int y = 0;

	public static void main(String[] args) {
		/*for (int z = 0; z < 3; z++) {
			switch (z) {
			case x:
				System.out.print("0 ");
			case x - 1:
				System.out.print("1 ");
			case x - 2:
				System.out.print("2 ");
			}
		}*/
		System.out.println(switchTest(2));
	}

	public static int switchTest(int x) {
		switch (x) {
		case 1:
			return 1;
		case 2:
			return 2;
		default:
			return -1;
		}
	}
}
