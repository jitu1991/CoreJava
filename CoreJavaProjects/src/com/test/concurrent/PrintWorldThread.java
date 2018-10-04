package com.test.concurrent;

public class PrintWorldThread implements Runnable{

	private String world;

	public PrintWorldThread(String world) {
		this.world = world;
	}
	
	public void run() {
		for(int i = 0; i < 5; i++) {
			synchronized (world) {
				try {
					System.out.println(world);
					world.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				world.notify();
			}
		}
	}
}
