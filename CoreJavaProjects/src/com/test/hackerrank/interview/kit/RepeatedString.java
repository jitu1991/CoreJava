package com.test.hackerrank.interview.kit;

public class RepeatedString {
	public static void main(String[] args) {
		String str = "a";
		long rep = 1000000000000l;
		System.out.println(repeatedString(str, rep));
	}
	
	static long repeatedString(String s, long n) {
        char[] arr = s.toCharArray();
        long strLength = s.length();
        long count = 0;
        for(int i= 0; i < arr.length; i++) {
            if(arr[i]=='a') {
                count++;
            }
        }
        long noOfSet = n/strLength;
        long rem = n%strLength;
        
        int tempCount = 0;
        for(int i= 0; i < rem; i++) {
            if(arr[i]=='a') {
                tempCount++;
            }
        }
        
        long occur = noOfSet * count;
        return occur + tempCount;
    }
}
