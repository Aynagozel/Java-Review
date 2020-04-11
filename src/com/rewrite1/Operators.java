package com.rewrite1;

import java.util.Scanner;

public class Operators {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		int num1, num2, total=0;
		char op;
		
		System.out.println("Please enter first number");
		num1=scan.nextInt();
		System.out.println("Please enter operator");
		op=scan.next().charAt(0);
		System.out.println("Please enter second number");
		num2=scan.nextInt();
		
		switch(op) {
		case'*':
			total=num1*num2;
			break;
		case'/':
			total=num1/num2;
			break;
		case'+':
			total=num1+num2;
			break;
		case'-':
			total=num1-num2;
		default:
			
		}
		System.out.println(total);
		
	}
}
