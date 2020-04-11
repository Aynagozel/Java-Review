package com.rewrite;

public class ModuleOperators {
	
	public static void main(String[] args) {
		 
		float num1=12.5f;
		float num2=3.5f;
		float div=num1/num2;
		System.out.println(div);
		
		int number1=13;
		int number2=2;
		
		int divOfIntegers=number1/number2;
		System.out.println(divOfIntegers);
		
		double d=12;
		System.out.println(d);
		// int i=12.5; connot convert from double
		
		// modules gives remaining of the division;
	
		int a=12;
		int b=2;
		
		int remainder=a%b;
		System.out.println(remainder);
		
		int myNumber=8+8%2;//8 or 0
		System.out.println(myNumber);
	}
}
