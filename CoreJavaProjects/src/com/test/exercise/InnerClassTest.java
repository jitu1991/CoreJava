package com.test.exercise;

public class InnerClassTest {
	InnerClassTest() {
		System.out.print("foo");
	}

	void makeBar() {
		(new Bar() {}).go();
	}

	class Bar {
		Bar() {
			System.out.print("bar");
		}

		public void go() {
			System.out.print("hi");
		}
	} /* class Bar ends */

	public static void main(String[] args) {
		InnerClassTest f = new InnerClassTest();
		f.makeBar();
	}
}