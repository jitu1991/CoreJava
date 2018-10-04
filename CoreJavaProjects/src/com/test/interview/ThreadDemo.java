package com.test.interview;
class Developer {
	
}

class Tester extends Developer {
	
}


public class ThreadDemo {
	public static void main(String[] args) {
		Developer dev;
		dev = null;
		Runnable r = (Runnable)dev;
		r.run();
	}

}
