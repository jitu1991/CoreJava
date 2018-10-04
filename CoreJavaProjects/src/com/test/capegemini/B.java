package com.test.capegemini;
class A implements Runnable {
	public void run() {}
}
public class B {
	public static void main(String[] args) {
		Thread t1 = new Thread();
		Thread t2 = new Thread(new A());
		Thread t3 = new Thread(new A(),"A");
		Thread t4 = new Thread("A");
	}
}
