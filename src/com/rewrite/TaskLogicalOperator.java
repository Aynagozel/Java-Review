package com.rewrite;

import java.util.Scanner;

public class TaskLogicalOperator {
	public static void main(String[] args) {
		int feet;
		Scanner scan;
		scan=new Scanner(System.in);
		System.out.println("Please enter your height");
		feet=scan.nextInt();
		
		if(feet<5) {
			System.out.println("You are short");
		}else if(feet<=6) {
			System.out.println("You are medium");
		}else if(feet<=7) {
			System.out.println("You are tall");
		}else {
			System.out.println("Unknown feet");
		}
	}
}
