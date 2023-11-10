package org.lessons.java;

import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {	
		try (Scanner in = new Scanner(System.in)) {
			String word = "";
			do {
				int letterSum = 0;
				int digitSum = 0;
				int specialSum = 0;
				
				System.out.println("Write anything: ");
				word = in.nextLine();
				
				if (word.equals("0")) return;
				
				for (int i = 0; i < word.length(); i++) {
					char character = word.charAt(i);
					
					if (Character.isLetter(character)) letterSum += 1;
					else if (Character.isDigit(character)) digitSum += 1;
					else if (!Character.isLetterOrDigit(character)) specialSum += 1;
				}
				
				System.out.println("In the word '" + word + "' there are:");
				System.out.println(letterSum + " letters");
				System.out.println(digitSum + " digits");
				System.out.println(specialSum + " special characters");
				
			} while (!word.equals("0"));
			
			in.close();
		}
	}
}
