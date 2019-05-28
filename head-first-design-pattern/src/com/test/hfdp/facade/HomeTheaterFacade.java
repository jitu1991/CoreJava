package com.test.hfdp.facade;

public class HomeTheaterFacade {
	Amplifier amp;
	Tuner tuner;
	Projector projector;
	Light light;
	Screen screen;
	DvdPlayer dvd;
	
	public HomeTheaterFacade(Amplifier amp, Tuner tuner, Projector projector, Light light, Screen screen, DvdPlayer dvd) {
		this.amp = amp;
		this.tuner = tuner;
		this.projector = projector;
		this.light = light;
		this.screen = screen;
		this.dvd = dvd;
	}
	
	public void watchMovie(String movie) {
		System.out.println("Get ready to watch movie");
		light.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		dvd.playMovie(movie);
	}

	public void endMovie() {
		light.on();;
		screen.up();;
		projector.off();
		amp.off();
		dvd.off();
	}
}
