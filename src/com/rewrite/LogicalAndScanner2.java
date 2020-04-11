package com.rewrite;

import java.util.Scanner;

public class LogicalAndScanner2 {
	public static void main(String[] args) {

		int age;
		String human;
		Scanner scan;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter your age");
		age = scan.nextInt();

		

		if (age >= 1 && age <= 3) {
			human = "baby";

		} else if (age > 3 && age <= 5) {
			human = "toddler";
		} else if (age > 5 && age <= 12) {
			human = "kid";
		}else if(age>12 && age<=19) {
			human="teenager";
		}else if(age>19) {
			human="adult";
		}else {
			human="unknown";
		}
		System.out.println("You are "+human);

	}
}