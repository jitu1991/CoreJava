package com.test.interview;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.text.html.InlineView;

import com.test.java.Person;

class A1 {}

public class SerializationTest implements Serializable {
	private static A1 a = new A1();
	public static void main(String... args) {
		SerializationTest b = new SerializationTest();
		try {
			FileOutputStream fs = new FileOutputStream("e:\\b.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fs);
			oos.writeObject(b);
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}
