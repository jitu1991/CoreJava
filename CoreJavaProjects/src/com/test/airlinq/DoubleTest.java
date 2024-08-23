package com.test.airlinq;

import java.util.Optional;

public class DoubleTest {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        double result = x / y;
        System.out.println(result);

		Optional<String> opt = Optional.ofNullable(null);
		System.out.println(opt.orElse("Default"));

	}
}