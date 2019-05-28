package com.test.hfdp.facade;

public class Light {
	public void on() {
		System.out.println("lights on");
	}

	public void dim(int i) {
		System.out.println("light dim to " + i);
	}
}
