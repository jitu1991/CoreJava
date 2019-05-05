package com.test.concurrency;

import java.util.concurrent.atomic.AtomicLong;

public class Account1 {
	private AtomicLong balance;

	public Account1() {
		balance = new AtomicLong();
	}

	public long getBalance() {
		return balance.get();
	}

	public void setBalance(long balance) {
		this.balance.set(balance);
	}

	public void addAmount(long amount) {
		this.balance.getAndAdd(amount);
	}

	public void subtractAmount(long amount) {
		this.balance.getAndAdd(-amount);
	}
}
