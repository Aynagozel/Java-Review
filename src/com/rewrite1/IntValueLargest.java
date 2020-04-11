package com.rewrite1;

import java.util.Scanner;

public class IntValueLargest {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int num1=scan.nextInt();
		
		System.out.println("Please enter a number");
		int num2=scan.nextInt();
		System.out.println("Please enter a number");
		int num3=scan.nextInt();
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println("Largest number is "+num1);
			}else {
				System.out.println("Largest number is "+num3);
			}
		}else {
			System.out.println("Largest number is "+num2);
		}
	}
}
