package com.test.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Day28Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int noOfRows = in.nextInt();
		List<String> listOfName = new ArrayList<String>();

		for (int i = 0; i < noOfRows; i++) {
			String name = in.next();
			String email = in.next();
			
			String namePattern = "[a-z]{1,20}";
			String emailPattern = ".+@gmail\\.com$";
			
			Pattern p = Pattern.compile(emailPattern);

			// We need a Matcher to match our compiled RegEx to a String
			Matcher m = p.matcher(email);

			// if our Matcher finds a match
			if (m.find()) {
				listOfName.add(name);
			}
		}
		Collections.sort(listOfName);
		for (String name : listOfName){
            System.out.println(name);
        }
		in.close();
	}
}
