package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Write a number: ");
		int value = Integer.valueOf(in.nextLine());
		
		in.close();
		
		if (value % 2 == 0) System.out.println("Result: " + value);
		else System.out.println("Result: " + (value + 1));
	}
}
