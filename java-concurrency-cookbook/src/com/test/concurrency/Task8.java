package com.test.concurrency;

import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

public class Task8 extends ForkJoinTask<Integer> {
	private int numbers[];
	private int start, end, number;
	private TaskManager manager; 


	public Task8(int[] numbers, int start, int end, int number, TaskManager manager) {
		this.numbers = numbers;
		this.start = start;
		this.end = end;
		this.number = number;
		this.manager = manager;
	}


	@Override
	public Integer getRawResult() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	protected void setRawResult(Integer value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean exec() {
		// TODO Auto-generated method stub
		return false;
	}
}
