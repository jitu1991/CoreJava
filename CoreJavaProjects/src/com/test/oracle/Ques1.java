package com.test.oracle;

class Ques1 {
	Ques1 h1;
	
	Ques1() {
		
	}
	
	Ques1(Ques1 h) {
		h1 = h;
	}
	
	public static void main(String[] args) {
		Ques1 h2 = new Ques1();
		Ques1 h3 = new Ques1(h2);
		h3.test();
		Ques1 h4 = h3.h1;
		h4.test();
		Ques1 h5 = h2.h1;
		h4.test();
	}
	
	void test() {
		System.out.print("Hi");
	}
}
