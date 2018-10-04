package com.test.concurrent;

import java.util.PriorityQueue;

public class PriorityQueueTest {

	public static void main(String[] args) {
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("2");
		queue.add("4");
		System.out.println(queue.peek()+ " ");
		queue.offer("1");
		queue.add("3");
		queue.remove("1");
		System.out.println(queue.poll()+ " ");
		
		if(queue.remove("2")) {
			System.out.println(queue.poll()+ " " + queue.peek());
		}
	}
}
