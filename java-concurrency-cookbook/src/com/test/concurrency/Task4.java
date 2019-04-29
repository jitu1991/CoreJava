package com.test.concurrency;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class Task4 implements Callable<String> {
	private String name;

	public Task4(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		System.out.printf("%s: Starting at : %s\n", name, new Date());
		return "Hello, world";
	}
}
