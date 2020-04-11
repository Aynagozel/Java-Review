package com.rewrite;

public class Task4 {
	
	public static void main(String[] args) {
		/*
		 * Write a program to add, subtract, multiply and divide by 2 decimals
		 * Your program should say.
		 * 
		 */
		
		double num1, num2;
		
		num1=20.50;
		num2=10.77;
		
		double sum=num1+num2;
		double sub=num1-num2;
		double mult=num1*num2;
		double div=num1/num2;
		
		System.out.println("The addition of 2 numbers "+num1+" and "+num2+ " is equal to "+sum);
		System.out.println("The substraction of 2 numbers "+num1+ " and "+num2+ " is equal to "+sub);
		System.out.println("The multiplicaton of 2 numbers "+num1+ " and "+num2+ " is equal to "+ mult);
		System.out.println("The division of 2 numbers "+num1+ " and "+num2+ " is equal to "+div);
		
		
		int width=5;
		int height=8;
		int area=width*height;
		int perimeter=2*(width+height);
		/*
		 * The perimeter of a rectangle with width__
		 * and height____ is equal to _____and the area is___"
		 */
		System.out.println("The perimeter of ractangle with width "+width+ " and height "+height+""
				+ " is equal to "+perimeter+ " and area is "+area);
		
		
	}
}
