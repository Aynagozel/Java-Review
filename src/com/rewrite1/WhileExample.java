package com.rewrite1;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
		/*let's  aks user to enter if it is raining or not(true or false)
		 * as long as there is rain let's keep asking
		 * as soon as there is no rain --> you can go to the park
		 * 
		 */
		
	Scanner scan;
	boolean isRain;
	scan=new Scanner(System.in);
	
	do {
		System.out.println("Is it rain?");
		 isRain=scan.nextBoolean();
	}while(isRain);
		System.out.println("Let's go to the park");
	}
}
