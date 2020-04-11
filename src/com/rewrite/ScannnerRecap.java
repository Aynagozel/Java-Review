package com.rewrite;

import java.util.Scanner;

public class ScannnerRecap {
	public static void main(String[] args) {
		
		// scanner class - to take an input from a user
		Scanner s=new Scanner(System.in);
		
		System.out.println("Please enter String value");
		String val=s.nextLine();//take entire line
		
		System.out.println("Please enter boolean value");
		boolean val1=s.nextBoolean();
		
		System.out.println("Please enter String value");
		String val2=s.next();//take first word antil space
		
		System.out.println("Please enter integer value");
		int val3=s.nextInt();
		
		System.out.println("Please enter double value");
		double val4=s.nextDouble();
		
		System.out.println(val);
		System.out.println(val1);
		System.out.println(val2);
		System.out.println(val3);
		System.out.println(val4);
		
	}
}
