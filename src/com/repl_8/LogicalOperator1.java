package com.repl_8;

import java.util.Scanner;

public class LogicalOperator1 {
	public static void main(String[] args) {

		int a = 40;
		int b = 30;
		int c = a + b;
		int d = 10;

		if (a > d && b > d) {
			System.out.println("true");
		}
		if (c > d) {
			System.out.println("true");
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("Do you need a loan?");
		boolean loan = scan.nextBoolean();
		String eligibility;

		if (loan) {
			System.out.println(" What is your credit score");
			int score = scan.nextInt();
			if (score < 600) {
				eligibility = "Not eligible";
			} else if (score >= 600 && score <= 700) {
				eligibility = "Maybe eligible";

			}else if(score >=701 && score<=800) {
				eligibility="Eligible";
			}else if(score>800) {
				eligibility="Definetily eligible";
			}else {
				eligibility="unknown";
			}
			System.out.println("The eligibility is "+eligibility );
			
		}
		//System.out.println("Eligibility is Unknown");
	}
}
