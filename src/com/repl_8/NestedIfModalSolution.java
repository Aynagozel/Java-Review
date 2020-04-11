package com.repl_8;

import java.util.Scanner;

public class NestedIfModalSolution {
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 
		 System.out.println("Please enter a number");
		 int number=scan.nextInt();
		 
		 if(number>=400) {
			 if(number<=600) {
				 System.out.println("Don't calculate commission");
			 }else {
				 System.out.println("Value is too large");
			 }
		 }else {
			 System.out.println("Calculate commission");
		 }
	}
}
