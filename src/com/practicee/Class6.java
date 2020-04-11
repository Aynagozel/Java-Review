package com.practicee;

import java.util.Scanner;

public class Class6 {
	
	public static void main(String[] args) {
		 
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
		String human;
		
		if (age>=1 && age<=3) {
			//System.out.println("You are a baby");
			human="baby";
		}else if(age>3 && age<=5) {
			//System.out.println("You are a toddler");
			human="toddler";
		}else if(age>5 && age<=12) {
			//System.out.println("Youn are a kid");
			human="kid";
		}else if(age >12 && age<19) {
			//System.out.println(" You are a teenager");
			human="teenager";
		}else if(age>19) {
			//System.out.println("You are an adult");
			human="adult";
		}else {
			//System.out.println("Invalid age entered");
			human="unknown";
		}
		System.out.println("You are " +human);
		
	}
	
}
