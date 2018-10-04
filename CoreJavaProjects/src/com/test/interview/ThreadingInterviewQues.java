package com.test.interview;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.test.interview.GetPingStatusWithExecutorService.MyRunnable;

public class ThreadingInterviewQues {
	public static final int MYTHREADS = 3;

	public static void main(String[] args) {
		String str = "pawan";
		char[] charArray = str.toCharArray();
		ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);

		for (int i = 0; i < charArray.length; i++) {
			char charC = charArray[i];
			Runnable worker = new MyRunnable(charC);
			executor.execute(worker);
		}

		executor.shutdown();
		// Wait until all threads are finish
		while (!executor.isTerminated()) {
		}
		System.out.println("\nFinished all threads");
	}

	public static class MyRunnable implements Runnable {
		private final char character;

		MyRunnable(char str) {
			this.character = str;
		}

		public void run() {
			String result = "";
			System.out.println(character);
		}
	}
}
