package com.test.exercise;

public class PasswordDiffChecker {
	public static void main(String[] args) {

		String oldPassword = "abcdefghi";
		String newPassword = "abdeghif";
		boolean isDiffPassword = false;
		int charDiff = 3;

		// New password should not contain <charDiff> characters of old password
		for (int i = 0; i < oldPassword.length(); i++) {
			if (i + charDiff <= oldPassword.length()) {
				String strToMatch = oldPassword.substring(i, i + charDiff);

				if (newPassword.contains(strToMatch)) {
					System.out.println("Password should be different. Repeated characters are: "
							+ strToMatch);
					isDiffPassword = false;
					break;
				} else {
					isDiffPassword = true;
				}
			}
		}

		if (isDiffPassword) {
			System.out.println("Password set as " + newPassword);
		}
	}

}
