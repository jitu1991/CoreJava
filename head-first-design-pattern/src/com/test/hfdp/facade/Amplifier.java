package com.test.hfdp.facade;

public class Amplifier {
	public void on() {
		System.out.println("amplifier on");
	}
	
	public void setVolume(int vol) {
		System.out.println("volume set to " + vol);
	}

	public void off() {
		System.out.println("ampifier off");
	}
}
