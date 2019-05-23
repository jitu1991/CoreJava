package com.test.hfdp.decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {
	public static void main(String[] args) throws FileNotFoundException {
		int c;
		try {
			InputStream is = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\jitender.kumar\\Documents\\BikeRentals.txt")));

			while ((c = is.read()) >= 0) {
				System.out.print((char) c);
			}
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
