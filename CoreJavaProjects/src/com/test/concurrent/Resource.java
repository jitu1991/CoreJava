package com.test.concurrent;

public class Resource {

	public void doSomething() {
		// do some operation, DB read, write etc
	}

	public void doLogging() {
		// logging, no need for thread safety
	}
}