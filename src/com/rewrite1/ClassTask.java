package com.rewrite1;

import java.util.Scanner;

public class ClassTask {
	public static void main(String[] args) {
		/*
		 * ask user to the enter they were born based on month define
		 * season is user is born in jan, feb, dec --> winter if mar, apr,
		 * may --> spring
		 * if jun,jul, aug --> summer if sep, oct, nov --> fall otherwise --> unknown
		 * at the end of the oprogram " you were born in _____"
		 */
		
		String month;
		Scanner scan=new Scanner(System.in);
		System.out.println("Month of born");
		month = scan.nextLine();
		
		String season;
		if(month.equals("December")|| month.equals("January") || month.equals("February")) {
			season="Winter";
		} else if(month.equals("March") || month.equals("April")||month.equals("May")) {
			season="Spring";
	
		}else if(month.equals("June")||month.equals("July")||month.equals("August")) {
			season="Summer";
		}else if(month.equals("September")||month.equals("October")||month.equals("November")) {
			season="Fall";
		}else {
			season="Unknown";
		}
		System.out.println("You were born in "+season);
		System.out.println(month);
	}
}
