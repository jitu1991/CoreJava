package com.test.serialization;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Externalizable { //Serializable{
	
	private String userName;
	private int age;
	
	
	public User() {	}

	public User(String userName, int age) {
		this.userName = userName;
		this.age = age;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(userName);
		out.writeInt(age);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		userName = (String) in.readObject();
		age = in.readInt();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}


public class ExternalizationTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File file = new File("d:\\ext.txt");
		User user = new User("Abc", 25);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
		oos.writeObject(user);
		
		ObjectInputStream iis = new ObjectInputStream(new FileInputStream(file));
		User desUser = (User) iis.readObject();
		
		System.out.println("after deserialization: User Name => " + desUser.getUserName() + " Age => " + desUser.getAge());
	}
}
