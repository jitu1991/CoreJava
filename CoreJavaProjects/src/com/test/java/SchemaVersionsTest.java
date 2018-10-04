package com.test.java;

public class SchemaVersionsTest {

	public static void main(String[] args) {
		
		String tempId = "1, 2, 3";
		String schemaVersion = "1.0-";
		String schemaVersions = "1.0.0, 2.0.1, 3.0.1";
		
		String str1 = " aa ";
		String str2 = str1;
		//System.out.println(str1);
		//System.out.println(str2);
		
		String[] schemasList = schemaVersions.split(",");
		
		System.out.println(schemasList.length);
		for(String str : schemasList) {
			System.out.println(str);
		}

	}

}
