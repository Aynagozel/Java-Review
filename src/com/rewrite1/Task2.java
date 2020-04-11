package com.rewrite1;

import java.util.Scanner;

public class Task2 {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your country");
		String country=scan.nextLine();
		
		String language;
		
		switch(country) {
		case "Turkmenistan":
			language="Turkmence";
			break;
		case"Turkiye":
			language="Turkce";
			break;
		case"Azerbaycan":
			language="Arerice";
			break;
		case"Dagystan":
			language="dagca";
			break;
		default:
			language="Unknown";
			
		}
		System.out.println("Language in your country "+language);
	
	}
}
