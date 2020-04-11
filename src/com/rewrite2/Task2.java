package com.rewrite2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		for(int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		//task
		Scanner scan=new Scanner(System.in);
		System.out.println("Are you apply to credit card?");
		String card=scan.nextLine();
		
		for(int i=1; i<=10; i++) {
			if(card.equalsIgnoreCase("Yes")) {
				break;
			}
		}
	}
	
}
