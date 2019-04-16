package com.test.concurrency;

public class Cinema {
	private long vacantSeatsCinema1;
	private long vacantSeatsCinema2;
	
	private final Object controlCinema1, controlCinema2;

	public Cinema() {
		vacantSeatsCinema1 = 20;
		vacantSeatsCinema2 = 20;
		controlCinema1 = new Object();
		controlCinema2 = new Object();
	}
	
	public boolean sellTickets1(int numberOfTicket) {
		synchronized (controlCinema1) {
			if(numberOfTicket < vacantSeatsCinema1) {
				vacantSeatsCinema1 -= numberOfTicket;
				return true;
			} else {
				return false;
			}
		}
	}
	
	public boolean sellTickets2(int numberOfTicket) {
		synchronized (controlCinema2) {
			if(numberOfTicket < vacantSeatsCinema2) {
				vacantSeatsCinema2 -= numberOfTicket;
				return true;
			} else {
				return false;
			}
		}
	}
	
	public boolean returnTickets1(int numberOfTicket) {
		synchronized (controlCinema1) {
			vacantSeatsCinema1 += numberOfTicket;
			return true;
		}
	}
	
	public boolean returnTickets2(int numberOfTicket) {
		synchronized (controlCinema2) {
			vacantSeatsCinema2 += numberOfTicket;
			return true;
		}
	}
	
	public long getVacantSeatsCinema1() {
		return vacantSeatsCinema1;
	}

	public long getVacantSeatsCinema2() {
		return vacantSeatsCinema2;
	}
}
