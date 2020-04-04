package com.test.hackerrank.interview.kit;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {

	public static void main(String[] args) {
		int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};//{10,20,20,10,10,30,50,10,20};
		System.out.println(sockMerchant(ar.length, ar));
	}
	
	static int sockMerchant(int n, int[] ar) {
		Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
        	if(map.containsKey(ar[i]))
        		continue;
        	else
        		map.put(ar[i], 1);
            for(int j= i+1; j < n; j++) {
            	if(ar[i] == ar[j]) {
            			Integer integer = map.get(ar[i]);
            			map.put(ar[i], integer+1);
            	}
            }
        }
        
        int pairCount = 0;
        for(Integer value : map.values()) {
        	pairCount = pairCount + value/2;
        }
        System.out.println(pairCount);
        return pairCount;
    }
}
