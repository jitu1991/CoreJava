package com.test.oracle;

class Base {
	private int i;
	
	Base(int i) {
		this.i = i;
	}
}

class te {
	te() {
		System.out.println("inside te");
	}
}

class fe extends te {
	fe(int i) {
		System.out.println("inside fe");
	}
}

/*class Extended extends Base {

}*/
public class DefaultConstructorTest {

	public static void main(String[] args) {
		fe f = new fe(1);
	}

}
