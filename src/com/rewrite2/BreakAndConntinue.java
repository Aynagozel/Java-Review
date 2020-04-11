package com.rewrite2;

import java.util.Scanner;

public class BreakAndConntinue {
	public static void main(String[] args) {
		
		// task
		
		for(int i=1; i<50; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println(i);
		}
		//task 2
		String card;
		Scanner scan=new Scanner(System.in);
		
		for(int q=1; q<=10; q++) {
			System.out.println("Are you apply to a credit card?");
			card = scan.nextLine();
			if(card.equalsIgnoreCase("yes")) {
				break;
			}
			System.out.println("******************");
			
		}
		// Break keyword breaks/exist the loop
		for(int i =0; i<10; i++) {
			if(i==2) {
				break;
			}
			System.out.println(i);
		}
	}
}
