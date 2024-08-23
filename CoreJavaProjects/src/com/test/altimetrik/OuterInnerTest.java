package com.test.altimetrik;

import java.util.List;

public class OuterInnerTest {

	public static int temp1 = 1;
	private static int temp2 = 2;
	public int temp3 = 3;
	private int temp4 = 4;

	public class Inner {
		private int getSumOf2() {
			return (temp1 + temp2);
		}
		private int getSumOf3() {
			return (temp1 + temp3);
		}
		private int getSumOf4() {
			return (temp1 + temp4);
		}
	}

	public static void main(String[] args) {
		//OuterInnerTest.Inner obj = new OuterInnerTest().Inner();
	}


}