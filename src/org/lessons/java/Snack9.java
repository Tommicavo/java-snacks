package org.lessons.java;

public class Snack9 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
		
		int[] evenNumbers = new int[0];
		int[] oddNumbers = new int[0];
		
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				int currentLen = evenNumbers.length;
				int[] auxEvenNumbers = new int[currentLen + 1];
				for (int j = 0; j < evenNumbers.length; j++) {
					auxEvenNumbers[j] = evenNumbers[j];
				}
				auxEvenNumbers[currentLen] = numbers[i];
				evenNumbers = auxEvenNumbers;
			}
			else {
				int currentLen = oddNumbers.length;
				int[] auxOddNumbers = new int[currentLen + 1];
				for (int j = 0; j < evenNumbers.length; j++) {
					auxOddNumbers[j] = oddNumbers[j];
				}
				auxOddNumbers[currentLen] = numbers[i];
				oddNumbers = auxOddNumbers;
			}
		}
		
		System.out.print("All numbers: ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.print("\nEven numbers: ");
		for (int i = 0; i < evenNumbers.length; i++) {
			System.out.print(evenNumbers[i] + " ");
		}
		
		System.out.print("\nOdd numbers: ");
		for (int i = 0; i < oddNumbers.length; i++) {
			System.out.print(oddNumbers[i] + " ");
		}
	}
}
