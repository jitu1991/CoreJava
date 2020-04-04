package com.test.interview;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Java program to demonstrate How ClassLoader works in Java, in particular
 * about visibility principle of ClassLoader.
 * 
 * @author Javin Paul
 */
class Ao {
	 Ao(){ 
		 new Ao(); 
		 } 
}

public class ClassLoaderTest {

	public static void main(String args[]) {
		/*try {
			// printing ClassLoader of this class
			System.out.println("ClassLoaderTest.getClass().getClassLoader() : "
					+ ClassLoaderTest.class.getClassLoader());

			// trying to explicitly load this class again using Extension class
			// loader
			Class.forName("test.ClassLoaderTest", true, ClassLoaderTest.class
					.getClassLoader().getParent());
		} catch (ClassNotFoundException ex) {
			Logger.getLogger(ClassLoaderTest.class.getName()).log(Level.SEVERE,
					null, ex);
		}*/
		Ao a = new Ao();
		System.out.println(a);
	}

}