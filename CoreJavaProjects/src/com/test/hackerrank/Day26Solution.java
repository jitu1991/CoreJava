package com.test.hackerrank;

import java.util.Scanner;

public class Day26Solution {
	public static void main(String[] args) {

		int returnDate, returnMonth, returnYear;
		int expDate, expMonth, expYear;

		Scanner in = new Scanner(System.in);

		returnDate = in.nextInt();
		returnMonth = in.nextInt();
		returnYear = in.nextInt();
		expDate = in.nextInt();
		expMonth = in.nextInt();
		expYear = in.nextInt();
		in.close();
		
		int yearDifference = returnYear-expYear;
		int monthsLate = returnMonth-expMonth;
		int daysLate = returnDate-expDate;
		
		if(returnYear > expYear) {
			System.out.println(10000);
		} else {
			if(returnYear == expYear) {
				if(returnMonth == expMonth) {
					if(returnDate <= expDate) {
						System.out.println(0);
					} else {
						System.out.println(15*(returnDate-expDate));
					}
				} else {
					if(returnMonth < expMonth) {
						System.out.println(0);
					} else {
						System.out.println(500*(returnMonth-expMonth));
					}
				}
			} else {
				System.out.println(0);
			}
		}

		//Two TC Failing...
		/*if(returnYear <= expYear) {
			System.out.println(0);
			if(returnMonth <= expMonth) {
				if(returnDate <= expDate) {
					System.out.println(0);
				} else {
					System.out.println(15*(returnDate-expDate));
				}
			} else {
				System.out.println(500*(returnMonth-expMonth));
			}
		} else {
			System.out.println(10000);
		}*/
		

		System.out.println (
	            (returnYear - expYear > 0 ) ? 10000 
	            : (returnMonth - expMonth > 0 && yearDifference == 0) ? monthsLate * 500
	                    : (returnDate - expDate > 0 && yearDifference == 0) ? daysLate * 15
	                            : 0
	    );
	}
}
