package com.test.iris;

class Aq {
	public int getNum(int a) {
		System.out.println(a);
		return a;
	}
	
	public void aTest(int a) {
		System.out.println(a);
	}
}

class Bq extends Aq {
	public int getNum(int a) {
		System.out.println(a);
		return 1;
	}
	public void aTest(int a, int b) {
		System.out.println(a +"" + "" +b);
	}
}
public class OverloadingTest {
	public static void main(String[] args) {
		Bq b = new Bq();
		b.aTest(3);
	}
	
}
