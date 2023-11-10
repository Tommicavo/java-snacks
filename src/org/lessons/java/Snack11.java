package org.lessons.java;

public class Snack11 {
	public static void main(String[] args) {
		int[] numbers = {1, 8, 16, 5, 6, 4, 2, 0, 8, 9, 15};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		double avg = 0.0;
		int sum = 0;
		int lng = numbers.length;
		
		for (int i = 0; i < numbers.length; i++) {
			int current = numbers[i];
			
			if (current > max) max = current;
			if (current < min) min = current;
			
			sum += current;
		}
		avg = (double) sum / lng;
		
		System.out.print("Numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.print("\nMax: " + max);
		System.out.print("\nMin: " + min);
		System.out.print("\nAverage: " + String.format("%.2f", avg));				
	}
}
