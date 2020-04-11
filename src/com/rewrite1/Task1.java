package com.rewrite1;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter your grade");
		char grade=scan.next().charAt(0);
		
		String exp;
	
		switch(grade) {
		case'A':
			exp="Excelent";
			break;
		case 'B':
			exp="Good";
			break;
		case'C':
			exp="Avarage";
			break;
		case'D':
			exp="Bad";
			break;
		default:
			exp="Not Acceptable";
			break;
		}
		System.out.println("Your grade is "+exp);
		
	}
}
