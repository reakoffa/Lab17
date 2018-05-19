package com.gc.PrimeApp;
import java.util.Scanner;

public class PrimeApp {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		String ans;
		
		System.out.println("This application will find you any prime, in order, from the first prime number on");
		
		do {
			System.out.println();
			int num = Validator.getInt(scnr, "What prime number would you like to see? ", 1, Integer.MAX_VALUE);
			System.out.println(PrimeNum.numPrime(num));
			ans = Validator.getString(scnr, "Find another prime? y/n ");
		} while (ans.equalsIgnoreCase("y"));
		System.out.println("Thanks for playing!");
	}
}
