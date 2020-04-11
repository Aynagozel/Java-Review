package com.rewrite;

import java.util.Scanner;

public class Task10 {
	public static void main(String[] args) {
		
		 Scanner input=new Scanner(System.in);
		 
		 int age=input.nextInt();
		 
		 if(age>=18) {
			 System.out.println("You will issue driver lisence to them");
		 }else {
			 System.out.println("We will offer you to get learners permit");
		 }
		 
		 
		 Scanner input1=new Scanner(System.in);
		 System.out.println("Do you have a credit card? true or false ");
		 boolean cc=input1.nextBoolean();
		 
		 if(cc) {
			 System.out.println("What is the balance on your card?");
			
		int balance=input.nextInt();
		
			 if(balance>1000) {
				 System.out.println("Please pay of your balance");
		 }else {
			 System.out.println("You can spend more money");
		 }
			 }else {
				 System.out.println("Would you like to apply for credit card?");
			 }
		 }
		 
	}

