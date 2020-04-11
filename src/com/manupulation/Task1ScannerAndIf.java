package com.manupulation;

import java.util.Scanner;

public class Task1ScannerAndIf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your class day:: ");
		String day = scan.nextLine();
		String day1 = day.toLowerCase();

		if (day.trim().toLowerCase().equals("saturday")) {
			System.out.println("Saturday is your Java class");
		} else if (day.trim().toLowerCase().equals("sunday")) {
			System.out.println("Sunday is your Git class");

		} else if (day.trim().toUpperCase().equals("TUESDAY")) {
			System.out.println("Tuesday is your SDLC class");
		} else if (day.trim().toLowerCase().equals("thursday")) {
			System.out.println("Thursday is your Manual Testing class");
		} else {
			System.out.println("Envalid Entry!!Please enter a valid class day");
		}
		scan.close();
	}
}
