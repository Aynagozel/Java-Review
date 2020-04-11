package com.rewrite1;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		 
		
		System.out.println("Enter first number");
		int num1=scan.nextInt();
		System.out.println("Enter operator");
		char op =scan.next().charAt(0);
		System.out.println("Enter second number");
		int num2=scan.nextInt();
		
		int result=0;

		switch(op) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		default:
		}
		System.out.println(result+op);
	}
}
