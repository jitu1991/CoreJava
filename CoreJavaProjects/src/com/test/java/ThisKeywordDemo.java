package com.test.java;

public class ThisKeywordDemo {
	int a;
	int b;

	public void setData(int c, int d) {
		a = c;
		b = d;
	}
	
	public void showData() {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		ThisKeywordDemo thisDemo = new ThisKeywordDemo();
		thisDemo.setData(2, 3);
		thisDemo.showData();
	}
	
	

}
