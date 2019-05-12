package com.test.concurrency;

import java.util.Collection;
import java.util.concurrent.locks.ReentrantLock;

public class MyLock1 extends ReentrantLock {
	public String getOwnerName() {
		if (this.getOwner() == null) {
			return "None";
		}
		return this.getOwner().getName();
	}

	public Collection<Thread> getThreads() {
		return this.getQueuedThreads();
	}
}
