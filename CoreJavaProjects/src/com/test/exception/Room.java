package com.test.exception;

import java.io.IOException;

class Building {
	void color() throws NullPointerException{
		System.out.println("Blue");
	}
}

class Room extends Building {
	// It throws an unchecked exception
	void color() throws NullPointerException {
		System.out.println("White");
	}

	public static void main(String args[]) throws IOException {
		Building obj = new Room();
		obj.color();
	}
}