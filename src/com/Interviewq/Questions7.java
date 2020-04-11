package com.Interviewq;

import java.util.Scanner;

public class Questions7 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println(" Please enter a number to check prime or not");
		
		int num=scan.nextInt();
		
		System.out.println("Is "+ num +" a prime number");
		
		boolean flag = false;
		for(int i =2; i <num/2; ++i) {
			
			// condition for nonprime number
			if(num% i==0) {
				flag=true;
				break;
			}
		}
		if (!flag)
			System.out.println(num+ " is a prime number.");
		else
			System.out.println(num+ " is not a prime number.");
	}
		
	}

