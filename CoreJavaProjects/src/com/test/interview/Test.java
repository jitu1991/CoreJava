package com.test.interview;

import static com.test.interview.Repetition.twice;
class Base {
	Base() {
		System.out.println("Base");
	}
}

class Super1 {
	public Integer getLength() {
		return new Integer(4);
	}
}

public class Test extends Super1 {

	/*
	 * public Test() { System.out.println("Test"); }
	 */

	public static void doStuff(int x, int... args) {
	}

	// public static void doStuff(int... args) { }
	// public static void doStuff(int... args, int x) { }

	static final int[] a;
	static { a = new int[2]; a[0] = 100; a[1] = 200; }
	
	public static void main(String[] args) {
		
		/*int []x = {1,2,3,4,5};
		int y[] = x;
		System.out.println(y[2]);*/
		
		/*doStuff(1);
		doStuff(1,2);*/

		/*new Test();
		new Base();
		
		float f1[ ], f2[ ]; 
        f1 = new float[10]; 
        f2 = f1; 
        System.out.println("f2[0] = " + f2[0]);*/
		
		
		/*class Foo {
			public int i = 9;
		}
		
		Object o = (Object)new Foo();
		Foo foo = (Foo)o;
		System.out.println(foo.i);*/
		
		System.out.println(twice("ab"));
	}
}
