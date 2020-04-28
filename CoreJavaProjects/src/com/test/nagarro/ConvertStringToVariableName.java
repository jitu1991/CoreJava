package com.test.nagarro;

public class ConvertStringToVariableName {
	public static void main(String[] args) {
		// TODO - Convert input string from java variable to c varianble and vice verca
		String cVarName = "user_name";
		String javaVarName = "userName";
		System.out.println(convertVariableName(cVarName));
		System.out.println(convertVariableName(javaVarName));
	}

	private static String convertVariableName(String cVarName) {
		String varName = "";
		char[] charArray = cVarName.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == '_') {
				varName = varName.concat(Character.toString(Character.toUpperCase(charArray[i+1])));
				i++;
				continue;
			}
			if(Character.isUpperCase(charArray[i])) {
				varName = varName.concat("_").concat(Character.toString(Character.toLowerCase(charArray[i])));
				continue;
			}
			varName = varName.concat(Character.toString(charArray[i]));
		}
		return varName;
	}
}
