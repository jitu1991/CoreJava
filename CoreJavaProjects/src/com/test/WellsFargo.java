package com.test;

public class WellsFargo {
    public static void main(String[] args) {
        fizzBuzz(15);
    }

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i < 3) {
                System.out.println(i);
                continue;
            }
            if (n % 3 == 0) {
                System.out.println("Fizz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
