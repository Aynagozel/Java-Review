package com.repl_8;

import java.util.Scanner;

public class Scanner2OnRepl {
	public static void main(String[] args) {
		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("Enter first num");
		int num1=inp.nextInt();
		
		System.out.println("Enter second num");
		int num2=inp.nextInt();
		
		System.out.println("Enter third num");
		int num3=inp.nextInt();
		
		if(num1>0) {
			System.out.println(num1+ " is a positive number");
		}else if(num2==0) {
			System.out.println("Entered number is equals to "+num2);
		}else {
			System.out.println(num3+ " is a negative number");
		}
		
		
	
		
	}
	
}
