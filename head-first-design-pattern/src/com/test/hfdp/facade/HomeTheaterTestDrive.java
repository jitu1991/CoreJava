package com.test.hfdp.facade;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier();
		Tuner tuner = new Tuner();
		Projector projector = new Projector();
		Light light = new Light();
		Screen screen = new Screen();
		DvdPlayer dvd = new DvdPlayer();
		
		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, projector, light, screen, dvd);
		homeTheater.watchMovie("Intersteller");
		homeTheater.endMovie();
	}
}
