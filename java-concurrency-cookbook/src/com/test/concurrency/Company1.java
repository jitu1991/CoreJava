package com.test.concurrency;

public class Company1 implements Runnable {

	private Account1 account;
	
	public Company1(Account1 account) {
		this.account = account;
	}

	@Override
	public void run() {
		for(int i = 0; i < 10; i++) {
			account.addAmount(1000);
		}
	}
}
