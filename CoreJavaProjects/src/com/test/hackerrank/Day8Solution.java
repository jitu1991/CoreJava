package com.test.hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8Solution {

	public static void main(String[] args) {
		Map<String, Integer> contactMap = new HashMap<>();
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            contactMap.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(contactMap.keySet().contains(s)) {
            	System.out.println(s+"="+contactMap.get(s));
            } else {
            	System.out.println("Not found");
            }
        }
        in.close();

	}

}
