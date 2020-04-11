package com.repl_5;

import java.util.Scanner;

public class StringScanner {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Please enter any programing language");
		String language=scan.nextLine();
		if(language.equals("Java")) {
			System.out.println("Java is a programing language");
		}else if(language.equals("C")) {
			System.out.println("C is a procedural programing language");
		}else if(language.equals("C++")) {
			System.out.println("C++ is a middle-level programing language");
		}else {
			System.out.println("Doesn't match any programing language");
		}
	}
}
