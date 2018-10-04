package com.test.multithreading;

class TicketBooking implements Runnable {

	private int ticketsAvailable = 1;

	@Override
	public void run() {
		System.out.println("Waiting to book tickets: " + Thread.currentThread().getName());

		synchronized (this) {

			if (ticketsAvailable > 0) {
				System.out.println("Booking tickets for " + Thread.currentThread().getName());

				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
				ticketsAvailable--;
				System.out.println("Ticket booked for " + Thread.currentThread().getName());
				System.out.println("currently Available tickets: " + ticketsAvailable);
			} else {
				System.out.println("Tickets not booked for " + Thread.currentThread().getName());
			}
		}
	}
}

public class TicketBookingExample {
	public static void main(String[] args) {
		TicketBooking obj = new TicketBooking();
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.start();
		t2.start();
	}
}
