package com.test.indiabix.javaclass;
interface abc {
	public void abc1();

}
public class ExamQ {
	static int j;
	int i;

	static void methodA(int i) {
		boolean b;
		do {
			b = i < 10 | methodB(4); /* Line 9 */
			b = i < 10 || methodB(8); /* Line 10 */
		} while (!b);
	}

	static boolean methodB(int i) {
		j += i;
		return true;
	}

	public static void main(String[] args) {
		System.out.println(j);
		methodA(0);
		System.out.println("j = " + j);
	}

}
