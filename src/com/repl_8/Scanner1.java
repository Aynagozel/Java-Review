package com.repl_8;

import java.util.Scanner;

public class Scanner1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your age");
		int age=scan.nextInt();
		
		int newAge=age+10;
		
		System.out.println("Your age after 10 years is "+newAge);
		
		System.out.println("Please enter your name ");
		String name=scan.nextLine();
		System.out.println("Please enter your mobile number");
		int mobile=scan.nextInt();
		System.out.println("please enter your age");
		int age1=scan.nextInt();
		
		System.out.println("Your name is "+name+ ","+" your age is "+age1+" and your mobile number is "+mobile);
		
		
		
		
		System.out.println("Please enter your name ");
		String name1=scan.nextLine();
		
		System.out.println("Your name is "+name);
		
		System.out.println("Please enter a sentence");
		String sentence=scan.nextLine();
		
		System.out.println(sentence);
		
		
	}
}
