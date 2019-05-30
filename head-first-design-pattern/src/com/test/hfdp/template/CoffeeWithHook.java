package com.test.hfdp.template;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
	
	public boolean customerWantCondiments() {
		String answer = getUserInput();
		if(answer.startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public void brew() {
		System.out.println("dripping through filter");
	}

	private String getUserInput() {
		String answer = null;
		System.out.println("Would you like to add condiments?");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch(IOException e) {
			System.err.println("Error reading answer");
		}
		if(answer == null) {
			return "no";
		}
		return answer;
	}
	

	@Override
	public void addCondiments() {
		System.out.println("add sugar and milk");
	}

}
