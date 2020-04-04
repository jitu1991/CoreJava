package com.test.hackerrank;

/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class TechgigChallenge {
    public static void main(String args[] ) throws Exception {

    	Scanner sc= new Scanner(System.in);
        int noOfInputs = sc.nextInt();
        Long[] requiredIngred = new Long[noOfInputs];
        Long[] availableIngred = new Long[noOfInputs];

        for(int i = 0; i < noOfInputs; i++) {
            requiredIngred[i] = sc.nextLong();
        }

        for(int i = 0; i < noOfInputs; i++) {
            availableIngred[i] = sc.nextLong();
        }
        
        try {
        long numOfPowerPuffGirls = availableIngred[0]/requiredIngred[0];
        for(int i = 1; i < noOfInputs; i++) {
            long temp = availableIngred[i]/requiredIngred[i];
            if(temp < numOfPowerPuffGirls) {
                numOfPowerPuffGirls = temp;
            }
        }
        System.out.println(numOfPowerPuffGirls);
        }
        catch(Exception e) {
        	System.out.println(0);
    }
    }
}
