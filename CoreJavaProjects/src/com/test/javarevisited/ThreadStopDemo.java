package com.test.javarevisited;

import java.util.concurrent.TimeUnit;

class Server implements Runnable {
	public volatile boolean bExit = false;

	public void run() {
		while (!bExit) {
			System.out.println("Server is running...");
		}
		System.out.println("Server is stopped");
	}

	public void stop() {
		bExit = true;
	}
}

public class ThreadStopDemo {
	public static void main(String[] args) throws InterruptedException {
		Server myServer = new Server();
		Thread t1 = new Thread(myServer, "T1");
		t1.start();

		// Now, let's stop our Server thread
		System.out.println(Thread.currentThread().getName()
				+ " is stopping Server thread");
		myServer.stop();

		// Let's wait to see server thread stopped
		TimeUnit.MILLISECONDS.sleep(200);
		System.out.println(Thread.currentThread().getName()
				+ " is finished now");
	}
}
