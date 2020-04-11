package com.rewrite;

import java.util.Scanner;

public class ScannerPractice {
	public static void main(String[] args) {
		
		//ask user 2 numbers and then compare them
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number");
		int num1=scan.nextInt();
		System.out.println("Please enter second number");
		int num2=scan.nextInt();
		
		if(num1>num2) {
			System.out.println(num1+ " is larger than "+num2);
		}else if(num1==num2) {
			System.out.println(num1+" is equal "+num2);
		}else {
			System.out.println(num1+ " is smaller than "+num2);
		}
		
		
		
		
	}
}
