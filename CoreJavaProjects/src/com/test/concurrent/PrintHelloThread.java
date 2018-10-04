package com.test.concurrent;

public class PrintHelloThread implements Runnable{

	private String hello;

	public PrintHelloThread(String hello) {
		this.hello = hello;
	}
	
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			synchronized (hello) {
				try {
					hello.notify();
					System.out.print(hello+" ");
					hello.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
