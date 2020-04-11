package com.rewrite1;

import java.util.Scanner;

public class ScannerSwich {
	public static void main(String[] args) {
		
		
		/* 
		 * ask user where they are from based on the country we will specify
		 * favorite food
		 */
		
		String country, foodName;
		Scanner scan;
		
		Scanner scan1 =new Scanner (System.in);
		System.out.println("Please enter your country");
		country=scan1.nextLine();
		
		switch(country){
		case"Turkey":
			foodName="kebab";
			break;
		case"Turkmenistan":
			foodName="Manty";
			break;
		case"Azerbaycan":
			foodName="Pilav";
			break;
		case"Moscow":
			foodName="Alivia";
			break;
		case"Ozbekistan":
			foodName="Samsa";
			break;
		case"Tajikistan":
			foodName="Piraski";
			break;
		default:
			foodName="Unknown";
		
		}
		System.out.println("You are from "+country+" and your favorite food is "+foodName);
		
	}
}
