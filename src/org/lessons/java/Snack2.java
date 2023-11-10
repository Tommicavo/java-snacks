package org.lessons.java;

public class Snack2 {
	public static void main(String[] args) {
		String[] nomi = {"Mario", "Luigi", "Giovanna", "Anna", "Carlo", "Maria", "Luca", "Giuseppe", "Elena", "Francesca"};
		String[] cognomi = {"Rossi", "Bianchi", "Verdi", "Russo", "Ferrari", "Esposito", "Romano", "Gallo", "Conti", "Marino"};
		
		if (nomi.length == cognomi.length) {			
			System.out.println("Lista invitati:");
			for (int i=0; i < nomi.length; i++) {
				System.out.println("- " + nomi[i] + " " + cognomi[i]);
			}
		}
	}
}
