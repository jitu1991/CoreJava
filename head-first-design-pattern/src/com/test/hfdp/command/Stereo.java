package com.test.hfdp.command;

public class Stereo {
	public void on() {
		System.out.println("stereo on");
	}
	public void off() {
		System.out.println("stereo off");
	}
	public void setCd() {
		System.out.println("stereo set Cd");
	}
	public void setDvd() {
		System.out.println("stereo set DVD");
	}
	public void setRadio() {
		System.out.println("stereo set Radio");
	}
	public void setVolume(int volume) {
		System.out.println("stereo volume set to : " + volume);
	}
}
