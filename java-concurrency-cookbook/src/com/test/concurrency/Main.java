package com.test.concurrency;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.Thread.State;
import java.util.ArrayDeque;
import java.util.Date;
import java.util.Deque;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String[] args) {
		 /* for (int i = 1; i <= 10; i++) {
			Calculator calc = new Calculator(i);
			Thread thread = new Thread(calc);
			thread.start();
		}*/

		/************************* Thread states **********************/
		/*Thread threads[] = new Thread[10];
		Thread.State status[] = new Thread.State[10];
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread(new Calculator(i));
			if (i % 2 == 0) {
				threads[i].setPriority(Thread.MAX_PRIORITY);
			} else {
				threads[i].setPriority(Thread.MIN_PRIORITY);
			}
			threads[i].setName("Thread " + i);
		}

		try {
			FileWriter writer = new FileWriter("c:\\users\\jitender.kumar\\documents\\log.txt");
			
			for (int i = 0; i < 10; i++) {
				writer.write("Main : Status of Thread " + i + " : " + threads[i].getState()+ "\n");
				status[i] = threads[i].getState();
			}

			for (int i = 0; i < 10; i++) {
				threads[i].start();
			}

			boolean finish = false;
			while (!finish) {
				for (int i = 0; i < 10; i++) {
					if (threads[i].getState() != status[i]) {
						writeThreadInfo(writer, threads[i],status[i]);
						status[i] = threads[i].getState();
					}
				}
				finish = true;
				for (int i = 0; i < 10; i++) {
					finish = finish && (threads[i].getState() == State.TERMINATED);
				}
			}
		} catch (Exception e) {

		}*/
		
		/************************* Interrupting running thread **********************/
		/* Thread task = new PrimeGenerator();
		System.out.println(System.currentTimeMillis());
		task.start();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {}
		task.interrupt();
		System.out.println(System.currentTimeMillis());*/
		
		/*FileSearch searcher = new FileSearch("c:\\users\\jitender.kumar\\documents\\test", "z");
		Thread thread = new Thread(searcher);
		thread.start();
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {}
		thread.interrupt();*/

		/************************* Sleeping and resuming thread **********************/
		/*Thread thread = new Thread(new FileClock());
		thread.start();
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.interrupt();*/
		
		/************************* Thread finalization with join **********************/
		/*DataSourcesLoader dsLoader = new DataSourcesLoader();
		Thread thread1 = new Thread(dsLoader,"DataSourceThread");
		NetworkConnectionsLoader ncLoader = new NetworkConnectionsLoader();
		Thread thread2 = new Thread(ncLoader,"NetworkConnectionLoader");
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.printf("Main: Configuration has been loaded: %s\n",new Date());*/
		
		/************************* Creating and running daemon thread **********************/
		/*Deque<Event> deque = new ArrayDeque<>();
		WriterTask writer = new WriterTask(deque);
		for(int i = 0; i< 3; i++) {
			Thread thread = new Thread(writer);
			thread.start();
		}
		
		CleanerTask cleaner = new CleanerTask(deque);
		cleaner.start();*/
		
		/************************* Exception handling with threads **********************/
		/*Task task = new Task();
		Thread t1 = new Thread(task);
		t1.setUncaughtExceptionHandler(new ExceptionHandler());
		t1.start();*/
		
		/************************* Using Thread local variables **********************/
		/*UnsafeTask unsafeTask = new UnsafeTask();
		for(int i = 0; i < 10; i++) {
			Thread t1 = new Thread(unsafeTask);
			t1.start();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}*/
		
		/*SafeTask safeTask = new SafeTask();
		for(int i = 0; i < 10; i++) {
			Thread t1 = new Thread(safeTask);
			t1.start();
			try {
				TimeUnit.SECONDS.sleep(2);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}*/
		
		/************************* Using ThreadGroup **********************/
		/*ThreadGroup threadGroup = new ThreadGroup("searcher");
		Result result = new Result();
		SearchTask searchTask = new SearchTask(result);
		
		for(int i = 0; i < 2; i++) {
			Thread thread = new Thread(threadGroup, searchTask);
			thread.start();
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.printf("Number of Threads: %d\n",threadGroup.activeCount());
		System.out.printf("Information about the Thread Group\n");
		threadGroup.list();
		
		Thread[] threads = new Thread[threadGroup.activeCount()];
		threadGroup.enumerate(threads);
		for (int i = 0; i < threadGroup.activeCount(); i++) {
			System.out.printf("Thread %s: %s\n", threads[i].getName(), threads[i].getState());
		}
		waitFinish(threadGroup);
		threadGroup.interrupt();*/
		
		/************************* Processing uncontrolled exception in threadgroup**********************/
		/*ThreadGroup threadGroup = new MyThreadGroup("MyThreadGroup");
		Task1 task = new Task1();
		
		for(int i = 0; i < 2; i++) {
			Thread thread = new Thread(threadGroup, task);
			thread.start();
		}*/
		
		/************************* Using ThreadFactory **********************/
		/*MyThreadFactory myThreadFactory = new MyThreadFactory("MyThreadFactory");
		Task2 task = new Task2();
		
		Thread thread;
		for(int i = 0; i < 10; i++) {
			thread = myThreadFactory.newThread(task);
			thread.start();
		}
		
		System.out.printf("Factory stats:\n");
		System.out.printf("%s\n",myThreadFactory.getStats());*/
	}

	private static void writeThreadInfo(FileWriter pw, Thread thread, State state) throws IOException {
		pw.write("\nMain : Id "+ thread.getId() +" - " + thread.getName() +"\n");
		pw.write("Main : Priority: " + thread.getPriority() + "\n");
		pw.write("Main : Old State: " + state + " \n");
		pw.write("Main : New State: " + thread.getState() + "\n");
		pw.write("Main : ************************************\n");
	}
	
	private static void waitFinish(ThreadGroup threadGroup) {
		while(threadGroup.activeCount() > 1) {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
