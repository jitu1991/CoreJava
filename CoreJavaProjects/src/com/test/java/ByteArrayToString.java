package com.test.java;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteArrayToString {
	public static void main(String args[]) throws IOException { 
		System.out.println("Platform Encoding : " + System.getProperty("file.encoding")); 
		FileInputStream fis = new FileInputStream("info.xml"); // Using Apache Commons IOUtils to read file into byte array 
		//byte[] filedata = IOUtils.toByteArray(fis); 
		//String str = new String(filedata, "UTF-8"); 
		//System.out.println(str); }
}

}
