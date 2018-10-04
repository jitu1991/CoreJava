package com.test.java;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

abstract class AbsTest {
	public abstract int sumUp(int[] arr);
}

class Abs2Test extends AbsTest {

	@Override
	public int sumUp(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
public class AbstractTest {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			public void run() {
				System.out.println("Inside abstract");
				
			}
		}).start();
		
		Object a = new HashSet();
		System.out.println(a instanceof SortedSet);
		System.out.println(a instanceof Set);
	}

}
