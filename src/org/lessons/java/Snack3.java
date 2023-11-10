package org.lessons.java;

public class Snack3 {
	public static void main(String[] args) {
		int[] values = {2, 5, 3, 1, 4, 2, 8, 5, 1, 3, 0, 2, 5, 3};
		
		int sum = 0;
		for (int i = 1; i < values.length; i += 2) {
			sum += values[i];
		}
		System.out.println("The sum of the values in odd position is: " + sum);
	}
}
