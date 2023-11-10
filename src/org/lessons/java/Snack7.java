package org.lessons.java;

import java.util.Scanner;

public class Snack7 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Write a number of seconds: ");
		int totalSec = Integer.valueOf(in.nextLine());
		
		in.close();
		
		int seconds = 0;
		int minutes = 0;
		int hours = 0;
		
		hours = totalSec / 3600;
		minutes = (totalSec / 60) - (hours * 60);
		seconds = totalSec - (hours * 3600) - (minutes * 60);
		
		String displayHours = String.format("%02d", hours);
		String displayMinutes = String.format("%02d", minutes);
		String displaySeconds = String.format("%02d", seconds);
		
		System.out.print(totalSec + " seconds correspond to ");
		System.out.println(displayHours + ":" + displayMinutes + ":" + displaySeconds);
	}
}
