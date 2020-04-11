package com.practicee;

import java.util.Scanner;

public class ClassFour {
	
	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("Please enter your city");
		String cityName=keyboard.nextLine();
		
		System.out.println("Please enter tempurature");
		int temp=keyboard.nextInt();
		
		int convertedTemp=(temp-32)*5/9;
		System.out.println("The tempurature in city "+ cityName + " is "+convertedTemp);
		
	}
}
