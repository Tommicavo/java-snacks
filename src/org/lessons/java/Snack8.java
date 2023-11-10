package org.lessons.java;

public class Snack8 {
	public static void main(String[] args) {
		String word = "Gabbiano";
		String newWord = "";
		
		for (int i = 0; i < word.length(); i++) {
			char character = word.charAt(i);
			
			if (character == 'a') character = 'o';
			else if (character == 'A') character = 'O';
			else if (character == 'o') character = 'a';
			else if (character == 'O') character = 'A';
			
			newWord += character;
		}
		
		System.out.println("Original word: " + word);
		System.out.println("Converted word: " + newWord);
	}
}
