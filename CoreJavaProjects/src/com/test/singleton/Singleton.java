package com.test.singleton;

import java.io.Serializable;

class Singleton implements Serializable {
	public static final Singleton instance = new Singleton();

	private Singleton() {
	}
	
	/*public Object readResolve() {
		return instance;
	}*/
}

/*class Singleton implements Cloneable {
	
	public static final Singleton instance = new Singleton();
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		//throw new CloneNotSupportedException();
		return instance;
	}
	
	private Singleton( ) {}
}*/