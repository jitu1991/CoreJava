package com.test.nagarro;

public class ConvertStringToVariableName {
	//Necessary Test Case Failing
	public static void main(String[] args) {
		// TODO - Convert input string from java variable to c varianble and vice verca
		String cVarName = "UserNameRavi";
		//String javaVarName = "userName";
		System.out.println(convertVariableName(cVarName));
		//System.out.println(convertVariableName(javaVarName));
	}

	private static String convertVariableName(String cVarName) {
		String varName = "";
		boolean isJavaVariable = true;
		char[] charArray = cVarName.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '_') {
				isJavaVariable = false;
				break;
			}
			if (Character.isUpperCase(charArray[i])) {
				isJavaVariable = true;
				break;
			}
		}
		
		for (int i = 0; i < charArray.length; i++) {
			if(isJavaVariable) {
				if(Character.isUpperCase(charArray[i])) {
					varName = varName.concat("_").concat(Character.toString(Character.toLowerCase(charArray[i])));
					continue;
				}
			} else {
				if (charArray[i] == '_') {
					varName = varName.concat(Character.toString(Character.toUpperCase(charArray[i+1])));
					i++;
					continue;
			}
			}
			varName = varName.concat(Character.toString(charArray[i]));
			/*
			 * if (charArray[i] == '_') { varName =
			 * varName.concat(Character.toString(Character.toUpperCase(charArray[i+1])));
			 * i++; continue; } if(Character.isUpperCase(charArray[i])) { varName =
			 * varName.concat("_").concat(Character.toString(Character.toLowerCase(charArray
			 * [i]))); continue; }
			 
			varName = varName.concat(Character.toString(charArray[i]));*/
		}
		return varName;
	}
}
