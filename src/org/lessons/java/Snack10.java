package org.lessons.java;

import java.util.Scanner;

public class Snack10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Write first number: ");
		int first = Integer.valueOf(in.nextLine());
		
		System.out.println("Write last number: ");
		int last = Integer.valueOf(in.nextLine());
		
		in.close();
		
		int sum = 0;
		int current = first;
		while (current <= last) {
			sum += current;
			current++;
		}
		System.out.println("The sum between [" + first + ", " + last + "] is " + sum);
	}
}
