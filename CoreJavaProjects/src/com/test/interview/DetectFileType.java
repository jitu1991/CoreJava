package com.test.interview;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;

enum FileType {
	NONE, XML, JSON
}

public class DetectFileType {

	public static void main(String[] args) {
		try {
			System.out.println(DetectFileType.getFileType("d:\\a.json"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	static FileType getFileType(String filePath) throws FileNotFoundException {
		FileType type = FileType.NONE;
		Scanner s = new Scanner(new File(filePath));
		while (s.hasNextLine()) {
			String currentLine = s.nextLine();
			
//			JSONArray array = new JSONArray(); 

		}
		return type;
	}
}
