package com.test.io;

import java.io.File;
import java.io.IOException;

public class CreateFileExample {

	public static void main(String[] args) {
		boolean isFileCreated = false;
		boolean isDirCreated = false;
		
		//Create Directory
		File stockDir = new File("D://stock1/5/6");
		
		//Create File
		File stockFile = new File("d://abc/abc.txt");

		try {
			//isFileCreated = stockFile.createNewFile();
			isDirCreated = stockDir.mkdir();//mkdirs()
		} catch (SecurityException e) {
			e.printStackTrace();
		}

		/*if(isFileCreated) {
			System.out.println("File "+stockFile.getPath()+" Created Successsfully");
		} else {
			System.out.println("File not Created");
		}*/
		
		if(isDirCreated) {
			System.out.println("Directory "+stockDir.getPath()+" Created Successsfully");
		} else {
			System.out.println("Directory not Created");
		}
	}
}
