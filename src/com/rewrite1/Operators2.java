package com.rewrite1;

import java.util.Scanner;

public class Operators2 {
	public static void main(String[] args) {
		
	
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Please enter first number");
	 int num1=scan.nextInt();
	 System.out.println("Please enter operator");
	 char op=scan.next().charAt(0);
	 System.out.println("Please enter second number");
	 int num2=scan.nextInt();
	 
	 int  total=0;
	 
	 switch(op) {
	 case'+':
		 total=num1+num2;
		 break;
	 case'-':
		 total=num1-num2;
		 break;
	 case'*':
		 total=num1*num2;
		 break;
	 case'/':
		 total=num1/num2;
		 break;
	default:
	 }
	 System.out.println(total);
}
}