package com.test.interview;

import java.security.spec.EncodedKeySpec;
import java.util.ArrayList;

public class VinTest {
	public static void main(String[] args) {
		try {
			System.out.println(VinTest.encode(126));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static String encode(int i) throws Exception {
		String code = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		if (i < 0)
			throw new Exception("Not Supported.");
		if (i >= code.length()) {
			return encode(i / code.length()) + encode(i % code.length());
		}
		return code.toCharArray()[i] + "";
	}
}
