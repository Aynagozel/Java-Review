package com.rewrite2;

import java.util.Scanner;

public class ToFindSecretNumberWithDoWhile {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int secretNumber=12, guessNumber;
		//for(int i=0; i<20; i++) --> you are limiting user to 20 inputs
		
		do {
			System.out.println("Please gueass my number from 1 to 20");
			guessNumber=scan.nextInt();
			
			if(guessNumber<secretNumber) {
				System.out.println("your number is too small");
			}else if(guessNumber > secretNumber) {
				System.out.println("Your number is too large");
			}
		}while(guessNumber !=secretNumber);
		System.out.println("Congratalations you got it");
	}
}
