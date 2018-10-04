package com.test.misc;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaStreamTest {
	
	private static final String COUNTRY_SEPARATOR = ",";
	private static String property = "IN, ES, AU, US";

	public static void main(String[] args) {
		
		
		/*List<Country> list = Arrays.stream(property.split(COUNTRY_SEPARATOR)).map(c -> new Country(c))
				.filter(c -> !(true && "EM".equals(c.getCode()))).collect(Collectors.toList());*/
	}

}
