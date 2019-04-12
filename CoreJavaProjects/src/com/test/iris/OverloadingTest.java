package com.test.iris;

class Aq {
	public int getNum(int a) {
		System.out.println(a);
		return a;
	}
}

class Bq extends Aq {
	public int getNum(int a) {
		System.out.println(a);
		return 1;
	}
}
public class OverloadingTest {

}
