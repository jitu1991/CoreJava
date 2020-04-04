package com.test.hackerrank.interview.kit;

public class JumpingOnClouds {

	public static void main(String[] args) {
		int[] ar = {0, 0, 0, 0, 1, 0};//{0, 0, 1, 0, 0, 1, 0};
		System.out.println(jumpingOnClouds(ar));
	}

	static int jumpingOnClouds(int[] c) {
        int lastIndex = c.length - 1;
        int currIndex = 0;
        int noOfJumps = 0;
        while(currIndex != lastIndex) {
            int currVal = c[currIndex];
            int oneJumpIndex = currIndex+1;
            int twoJumpIndex = currIndex+2;
            
            if(twoJumpIndex <= lastIndex && currVal == c[twoJumpIndex]) {
                noOfJumps++;
                currIndex = twoJumpIndex;
            } else if(oneJumpIndex <= lastIndex && currVal == c[oneJumpIndex]) {
                noOfJumps++;
                currIndex = oneJumpIndex;
            }
        }
        return noOfJumps;
    }
	
}
