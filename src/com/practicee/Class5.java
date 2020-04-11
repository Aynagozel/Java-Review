package com.practicee;

import java.util.Scanner;

public class Class5 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println(" Do you have credit card? true or false");
		boolean cc =input.nextBoolean();
		
		if(cc) {
			System.out.println(" What is the balance on your card?");
			int balance=input.nextInt();
			
			if(balance>1000) {
				System.out.println("Please pay of your balance");
			}else {
				System.out.println("You can spend more money");
			}
		}else {
			System.out.println(" Would you like to apply for credit card?");
		}
		
	}
	
}
