package com.test.exercise;

public class ReplaceString {
	public static void main(String[] args) {
		String str = "abcdefgheb";

		// System.out.println(str.substring(0, str.indexOf("de")));
		// System.out.println(str.substring(str.indexOf("de")+"de".length()));
		// System.out.println(str.substring(0, 2));
		// System.out.println(str.lastIndexOf("ee"));
		System.out.println(replaceString(str, "b", "zz"));
	}

	public static String replaceString(String input, String source, String dest) {
		int sourceIndex = input.indexOf(source);
		String firstString = input.substring(0, sourceIndex);
		String lastString = input.substring(sourceIndex + source.length());
		// System.out.println(sourceIndex);
		// System.out.println(input.substring(0, sourceIndex));
		// System.out.println(input.substring(sourceIndex + source.length()));

		String output = firstString + dest + lastString;

		if (output.contains(source)) {
			output = replaceString(output, source, dest);
		}
		return output;
	}
}
