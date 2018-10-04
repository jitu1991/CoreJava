package com.test.concurrent;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueTest {

	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(100);
		ConsumerThread consumer = new ConsumerThread(queue, 100);
		ProducerThread producer = new ProducerThread(queue, 100);
		new Thread(consumer).start();
		new Thread(producer).start();

		/*BlockingQueue<String> linkedBQueue = new LinkedBlockingQueue<String>(3);
		try {
			linkedBQueue.put("Java");
			linkedBQueue.put("Jre");
			linkedBQueue.put("Jdk");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //puts object into BlockingQueue
		System.out.println("size of BlockingQueue before peek : " + linkedBQueue.size());       
		System.out.println("example of peek() in BlockingQueue: " + linkedBQueue.peek());
		System.out.println("size of BlockingQueue after peek : " + linkedBQueue.size());
		System.out.println("calling poll() on BlockingQueue: " + linkedBQueue.poll());
		System.out.println("size of BlockingQueue after poll : " + linkedBQueue.size());*/

			
		Set<? extends Number> setOfAllSubTypeOfNumber = new HashSet<Integer>(); //legal - Integer extends Number
		setOfAllSubTypeOfNumber = new HashSet<Float>(); //legal - because Float extends Number

	}
}