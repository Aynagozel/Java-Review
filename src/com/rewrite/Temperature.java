package com.rewrite;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your city");
		String cityName=scan.nextLine();
		
		System.out.println("Please enter temperature");
		int temp=scan.nextInt();
		
		int convertedTemp=(temp-32)*5/9;
		System.out.println("The teperature is the city "+cityName+ " is "+convertedTemp);
	
		
	}
}
