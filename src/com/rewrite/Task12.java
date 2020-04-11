package com.rewrite;

import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Please enter your city name ");
		String name=scan.nextLine();
		System.out.println("Please enter temprerature");
		int temp=scan.nextInt();
		
		int convertedTemp=(temp-32)*5/9;
		
		System.out.println("The temprature is city "+name+ " is "+convertedTemp);
		
		
		
		
		
	
}
}
