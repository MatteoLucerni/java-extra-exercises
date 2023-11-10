package org.lessons.extra;

import java.util.Scanner;

public class CheckBigger {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserisci due numeri: ");
		int firstNumber = in.nextInt();
		int secondNumber = in.nextInt();
		
		int result = firstNumber;
		if(secondNumber > firstNumber)result = secondNumber;
		
		System.out.println("Il numero più alto è: " + result);
	}
}
