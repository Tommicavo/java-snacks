package org.lessons.java;

public class Snack4 {
	public static void main(String[] args) {
		String testString = "radar";
		int l = 0;
		int r = testString.length() - 1;
		
		while (l < r) {
			if (testString.charAt(l) != testString.charAt(r)) {
				System.out.println("The word '" + testString + "' is not palindrome");
				return;
			}
			l += 1;
			r -= 1;
		}
		System.out.println("The word '" + testString + "' is palindrome");
	}
}
