package com.test.interview;

class Super {
	public Super add() {
		return this;
	}
}

class Sub extends Super {
	
	@Override
	public Sub add() {
		return this;
	}
}
public class InheritenceDemo {
	public static void main(String[] args) {
		Super a = new Sub();
		Sub b = (Sub)a.add();
		System.out.println(a==b);

	}
}
