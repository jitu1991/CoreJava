package com.test.concurrent;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BasicThreadPoolExecutorExample
{
	public static void main(String[] args)
	{
		//Use the executor created by the newCachedThreadPool() method
		//only when you have a reasonable number of threads
		//or when they have a short duration.
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++)
		{
			Task task = new Task("Task " + i);
			System.out.println("A new task has been added : " + task.getName());
			executor.execute(task);
		}
		executor.shutdown();
		System.out.println(executor.isShutdown());
	}
}