package com.rewrite;

import java.util.Scanner;

public class Task9 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is amount of loan is needed? ");
		double loan=scan.nextDouble();
	
		
		
		if(loan>200000) {
			System.out.println("If loan is less than " +loan+ " I would lend the money");
		}else {
			System.out.println("I can reject the client");
		}
		
	}
}
