package com.practicee;

import java.util.Scanner;

public class Class4 {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Please enter your name");
		String name=scan.nextLine();
		
		System.out.println("Please enter mobile number");
		String mobile=scan.nextLine();
		
		System.out.println(" Please enter your age");
		int age=scan.nextInt();
		
		
		System.out.println(" Your name is " +name+ ","+ " your age is "+age+ " and your mobile number is "+mobile);
		
		
	
	double rate=5.5;
	double price=20000;
	
	if(rate>=4.5) {
		System.out.println(" I am not buying the house");
	}else {
		System.out.println(" I will consider");
		if(price>20000) {
			System.out.println(" I will need a loan to buy a house");
		}else {
			System.out.println("I will pay cash for my house");
		}
	}
}
}