package org.lessons.java;

import java.util.Scanner;

public class Snack6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		final int ASCII_SHIFT = 48;
		
		System.out.println("Write a number: ");
		String value = in.nextLine();
		
		in.close();
		
		int lng = value.length();
		int sum = 0;
		
		for (int i = 0; i < lng; i++) {
			char digit = value.charAt(i);
			int intDigit = digit - ASCII_SHIFT;
			int exp = lng - 1 - i;
			sum += intDigit * (Math.pow(10, exp));
		}
		System.out.println("Result: " + sum);
	}
}
