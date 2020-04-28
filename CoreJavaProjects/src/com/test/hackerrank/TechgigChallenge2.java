package com.test.hackerrank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TechgigChallenge2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfTestCases = sc.nextInt();
		
		BigInteger[] teamGPowers = null;
		BigInteger[] opponentPowers = null;
		
		for(int i = 0; i < noOfTestCases; i++) {
			int noOfInputs = sc.nextInt();
			
			teamGPowers = new BigInteger[noOfInputs];
			opponentPowers = new BigInteger[noOfInputs];
			
			for (int x = 0; x < noOfInputs; x++) {
				teamGPowers[x] = sc.nextBigInteger();
			}

			for (int y = 0; y < noOfInputs; y++) {
				opponentPowers[y] = sc.nextBigInteger();
			}
			
			System.out.println(getNoOfPossibleWins(teamGPowers, opponentPowers));
		}
	}
	
	public static int getNoOfPossibleWins(BigInteger[] teamGPowers, BigInteger[] opponentPowers) {
		Arrays.sort(teamGPowers, Collections.reverseOrder());
		Arrays.sort(opponentPowers, Collections.reverseOrder());

		int noOfPossibleWins = 0;

		int i = 0;
		int j = 0;
		while (i < teamGPowers.length) {
			if (i == teamGPowers.length || j == opponentPowers.length) {
				break;
			}
			if (teamGPowers[i].compareTo(opponentPowers[j]) == -1 || teamGPowers[i].compareTo(opponentPowers[j]) == 0) {//teamGPowers[i] <= opponentPowers[j]) {
				j++;
				continue;
			}
			noOfPossibleWins++;
			i++;
			j++;
		}

		return noOfPossibleWins;
	}
}
