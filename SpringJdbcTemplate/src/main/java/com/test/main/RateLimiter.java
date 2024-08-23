package com.test.main;


import java.util.HashMap;
import java.util.Map;

/*Whenever you expose a web service / api endpoint, you need to implement a rate limiter to prevent abuse of the service (DOS attacks).

Implement a RateLimiter Class with an isAllow method. Every request comes in with a unique clientID, deny a request
 if that client has made more than 100 request in past 2 sec.

 */
public class RateLimiter {
	private Map<String, Long> requestCountMap;
	private final int REQUEST_LIMIT = 100;
	private final long TIME_WINDOW_MILLIS = 2000;

	public RateLimiter() {
		this.requestCountMap = new HashMap<>();
	}

	public synchronized boolean isAllow(String clientId) {
		long currentTime = System.currentTimeMillis();

		// Remove entries older than TIME_WINDOW_MILLIS
		requestCountMap.entrySet().removeIf(entry -> currentTime - entry.getValue() > TIME_WINDOW_MILLIS);

		// Get the current request count for the client
		int requestCount = requestCountMap.getOrDefault(clientId, 0);

		// Check if the request count exceeds the limit
		if (requestCount < REQUEST_LIMIT) {
			// Increment the request count for the client
			requestCountMap.put(clientId, currentTime);
			return true;
		} else {
			return false; // Request limit exceeded
		}
	}

	public static void main(String[] args) {
		RateLimiter rateLimiter = new RateLimiter();

		// Simulate requests
		for (int i = 0; i < 110; i++) {
			String clientId = "client123";
			boolean isAllowed = rateLimiter.isAllow(clientId);

			if (isAllowed) {
				System.out.println("Request allowed for client: " + clientId);
			} else {
				System.out.println("Request denied for client: " + clientId);
			}

			// Introduce a delay between requests
			try {
				Thread.sleep(20); // Simulate some processing time
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}