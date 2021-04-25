package com.test.techgig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VirusOutbreak {

	public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        String virusComposition = sc.nextLine();
        String noOfPersons = sc.nextLine();
        List<String> bloodComposition = new ArrayList();
        for(int i =0; i< Integer.parseInt(noOfPersons); i++) {
                bloodComposition.add(sc.nextLine());
        }

        List<String> result = new ArrayList();
        for(String blood: bloodComposition) {
            int m = blood.length();
            int n = virusComposition.length();
            if(isSubSequence(blood, virusComposition,m,n)) {
                result.add("POSITIVE");
            } else {
                result.add("NEGATIVE");
            }
        }

        for(String res: result) {
            System.out.println(res);
        }
   	
   }

   static boolean isSubSequence(String str1, String str2,
                                 int m, int n)
    {
        int j = 0;
 
        // Traverse str2 and str1, and compare
        // current character of str2 with first
        // unmatched char of str1, if matched
        // then move ahead in str1
        for (int i = 0; i < n && j < m; i++)
            if (str1.charAt(j) == str2.charAt(i))
                j++;
 
        // If all characters of str1 were found
        // in str2
        return (j == m);
    }
}
