package com.test.concurrent;

public class ThreadDeadlock {

	String str1 = "Hello ";
	String str2 = "World";
	Thread t1 = new Thread("Thread-1"){
		@Override
		public void run() {
			while(true){
				synchronized (str1) {
					synchronized (str2) {
						System.out.println(str1+str2);
					}
					
				}
			}
		}
	};
	
	Thread t2 = new Thread("Thread-2"){
		@Override
		public void run() {
			while(true){
				synchronized (str2) {
					synchronized (str1) {
						System.out.println(str2+str1);
					}
				}
			}
		}
	};
	
	public static void main(String[] args) {
		ThreadDeadlock td = new ThreadDeadlock();
		
		td.t1.start();
		td.t2.start();
	}
}
