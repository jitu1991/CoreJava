package com.test.interview;

interface Printable {}

class AA implements Printable {
	public void a() {
		System.out.println("a method");
	}
}

class BB implements Printable {
	public void b() {
		System.out.println("b method");
	}
}

class Call {
	void invoke(Printable p) {// upcasting
		if (p instanceof AA) {
			AA a = (AA) p;// Downcasting
			a.a();
		}
		if (p instanceof BB) {
			BB b = (BB) p;// Downcasting
			b.b();
		}

	}
}// end of Call class

public class InstanceOfDemo {
	public static void main(String args[]) {
		Printable p = new BB();
		Call c = new Call();
		c.invoke(p);
	}
}
