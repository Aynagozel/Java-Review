package com.repl_8;

import java.util.Scanner;

public class ScannerClass4 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter First Name");
		String Name=scan.nextLine();
		
		System.out.println("Please enter Surname");
		String Surname=scan.nextLine();
		
	
		System.out.println(Name+" "+Surname);
	}
}
