package com.test.techgig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeGameTest {

	public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String noOfInputs = sc.nextLine();

        List<String> inputs = new ArrayList();
        for(int i =0; i< Integer.parseInt(noOfInputs); i++) {
                inputs.add(sc.nextLine());
        }
        
        for(String input: inputs) {
        	String[] nos = input.split(" ");
        	int first = Integer.parseInt(nos[0]);
        	int last = Integer.parseInt(nos[1]);
        	
        	List<Integer> allPrimesInRange = getAllPrimesInRange(first, last);
        	if(allPrimesInRange == null || allPrimesInRange.size() == 1) {
        		System.out.println(0);
        	} else if(allPrimesInRange.size() == 0) {
        		System.out.println(-1);
        	} else {
        		int firstPrime = allPrimesInRange.get(0);
        		int lastPrime = allPrimesInRange.get(allPrimesInRange.size()-1);
        		int diff = lastPrime - firstPrime;
        		System.out.println(diff);
        	}
        }
        
        

   	
   }
	
	static List<Integer> getAllPrimesInRange(int first, int last) {
		/*
		 * if(first == 1) { first++; }
		 */
		if(first == last) {
			return null;
		}

		List<Integer> primes = new ArrayList<Integer>();
		for(int i= first; i <= last; i++) {
			if(isPrime(i)) {
				primes.add(i);
			}
		}
		
		return primes;
	}

   static boolean isPrime(int number) {
	   if (number < 2) return false;
       if (number % 2 == 0) return (number == 2);
       int root = (int)Math.sqrt((double)number);
       for (int i = 3; i <= root; i += 2)
       {
           if (number % i == 0) return false;
       }
       return true;
		/*
		 * boolean isPrime = true; for(int i = 2; i <= num/2;i++) { if(num%i==0) {
		 * isPrime = false; break; } } return isPrime;
		 */
   }
}
