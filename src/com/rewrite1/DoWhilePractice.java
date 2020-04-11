package com.rewrite1;

public class DoWhilePractice {
	public static void main(String[] args) {
		int time=8;
		if(time<12) {// condition is true
			System.out.println("Good morning");// code executes 1
		}
		System.out.println("-_______________-");
		while(time<12) {//while condition is true
			System.out.println("Good morning");
			time++;
			
		}
		System.out.println("---------------");
		// I want to print GA 5 times
		int i=-1;
		
		while(i<4) {
			System.out.println("Good morning");
			i++;
		}
		System.out.println("Outside of while loop");
		
		
	}

}
