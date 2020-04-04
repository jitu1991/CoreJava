package com.test.iris;

import java.io.IOException;

import org.omg.CORBA.portable.ApplicationException;

public class TryFinallyTest {

	public static void main(String[] args) throws Exception {
		int x = 4;
		int y = 5;

		//System.out.println(returnNum(x, y));
		returnNum(x, y);
	}

	public static void returnNum(int a, int b) throws Exception {
		try {
			//++b;
			//return a;
			throw new IOException();
			//throw new Exception();
		} catch (IOException e) {
			throw new Exception("Problem connecting to server");
			//return b;
		} catch (Exception e) {
			System.out.println("Caught");
		/*} finally {
			return a+b;*/
		}
	}

}
