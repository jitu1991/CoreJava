package com.test.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationUtil {
	
	public static Object serialize(Object obj, String fileName) throws IOException {
		FileOutputStream fos = new FileOutputStream(fileName);
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(obj);
		
		os.close();
		return obj;
	}
	
	
	public static Object deSerialize(String fileName) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		ObjectInputStream is = new ObjectInputStream(fis);
		Object obj = is.readObject();
		
		is.close();
		return obj;
	}

}
