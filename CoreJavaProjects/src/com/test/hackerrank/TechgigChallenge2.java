package com.test.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class TechgigChallenge2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfInputs = sc.nextInt();

		/*List<Long> teamGPowers = new ArrayList<>();
		
		 * teamGPowers.add(20L); teamGPowers.add(30L); teamGPowers.add(50L);
		 
		List<Long> opponentPowers = new ArrayList<>();
		
		 * opponentPowers.add(40L); opponentPowers.add(25L); opponentPowers.add(60L);
		 

		for (int i = 0; i < noOfInputs; i++) {
			teamGPowers.add(sc.nextLong());
		}

		for (int i = 0; i < noOfInputs; i++) {
			opponentPowers.add(sc.nextLong());
		}

		Collections.sort(teamGPowers, Collections.reverseOrder());
		Collections.sort(opponentPowers, Collections.reverseOrder());

		
		 * for(int i = 0; i < noOfInputs; i++) { opponentPowers.add(sc.nextLong()); }
		 

		int noOfPossibleWins = 0;

		int i = 0;
		int j = 0;
		while (i < teamGPowers.size()) {
			if (i == teamGPowers.size() || j == opponentPowers.size()) {
				break;
			}
			if (teamGPowers.get(i) <= opponentPowers.get(j)) {
				j++;
				continue;
			}
			noOfPossibleWins++;
			i++;
			j++;
		}

		System.out.println(noOfPossibleWins);*/
		/*
		 * for(int i = 0; i < teamGPowers.size(); i++) { for(int j = 0; j <
		 * opponentPowers.size(); j++) { if(teamGPowers.get(i) < opponentPowers.get(j))
		 * break; noOfPossibleWins++; teamGPowers.remove(i); opponentPowers.remove(j); }
		 * } System.out.println(noOfPossibleWins);
		 */
		Long[] teamGPowers = new Long[noOfInputs];
		Long[] opponentPowers = new Long[noOfInputs];

		for (int i = 0; i < noOfInputs; i++) {
			teamGPowers[i] = sc.nextLong();
		}

		for (int i = 0; i < noOfInputs; i++) {
			opponentPowers[i] = sc.nextLong();
		}
		/*Arrays.sort(teamGPowers, Collections.reverseOrder());
		Arrays.sort(opponentPowers, Collections.reverseOrder());

		int noOfPossibleWins = 0;

		int i = 0;
		int j = 0;
		while (i < teamGPowers.length) {
			if (i == teamGPowers.length || j == opponentPowers.length) {
				break;
			}
			if (teamGPowers[i] <= opponentPowers[j]) {
				j++;
				continue;
			}
			noOfPossibleWins++;
			i++;
			j++;
		}
		System.out.println(noOfPossibleWins);*/
		
		Arrays.sort(teamGPowers);
		Arrays.sort(opponentPowers);

		TreeMap<Long, Long> map = new TreeMap<>();
		
		for (int i = 0; i < noOfInputs; i++) {
			for (int i = 0; i < noOfInputs; i++) {
				
			}
		}
		
		int noOfPossibleWins = 0;

		int i = 0;
		int j = 0;
		while (i < teamGPowers.length) {
			if (i == teamGPowers.length || j == opponentPowers.length) {
				break;
			}
			if (teamGPowers[i] <= opponentPowers[j]) {
				i++;
				continue;
			}
			noOfPossibleWins++;
			i++;
			j++;
		}
		System.out.println(noOfPossibleWins);
	}

	public static void reverse(Long[] input) {
		int last = input.length - 1;
		int middle = input.length / 2;
		for (int i = 0; i <= middle; i++) {
			Long temp = input[i];
			input[i] = input[last - i];
			input[last - i] = temp;
		}
	}

}
