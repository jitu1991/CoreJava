package com.test.concurrent;

import java.util.concurrent.CountDownLatch;

class Service implements Runnable{
	private final String name;
	private int timeToStart;
	private CountDownLatch latch;

	public Service(String name, int timeToStart, CountDownLatch latch) {
		this.name = name;
		this.timeToStart = timeToStart;
		this.latch = latch;
	}

	public void run() {
		try {
			Thread.sleep(timeToStart);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(name + "Service is Up");
		latch.countDown();
	}
}

public class CountDownLatchService {
	public static void main(String[] args) {
		final CountDownLatch latch = new CountDownLatch(3);
		Thread cacheService = new Thread(new Service("Cache", 2000, latch));
		Thread alertService = new Thread(new Service("Alert", 2000, latch));
		Thread validateService = new Thread(new Service("Validate", 2000, latch));

		cacheService.start();
		alertService.start();
		validateService.start();

		// application should not start processing any thread until all service is up
		// and ready to do there job.
		// Countdown latch is idle choice here, main thread will start with count 3
		// and wait until count reaches zero. each thread once up and read will do
		// a count down. this will ensure that main thread is not started processing
		// until all services is up.

		//count is 3 since we have 3 Threads (Services)


		try {
			latch.await();
			System.out.println("All services are up, Application is starting now");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
