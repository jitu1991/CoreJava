package com.test.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.test.concurrent.EagerSingleton;

public class SingletonSerializedTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		SerializedSingleton instance1 = SerializedSingleton.getInstance();
		
		//Serialize the object
		ObjectOutput oo = new ObjectOutputStream(new FileOutputStream("SerializeSingleton.ser"));
		oo.writeObject(instance1);
		oo.close();
		
		//Deserialize the object
		ObjectInput io = new ObjectInputStream(new FileInputStream("SerializeSingleton.ser"));
		SerializedSingleton instance2 = (SerializedSingleton)io.readObject();
		io.close();
		
		
		System.out.println("Instance1 hashcode "+instance1.hashCode());
		System.out.println("Instance2 hashcode "+instance2.hashCode());
	}

}
