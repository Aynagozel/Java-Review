package com.rewrite;

import java.util.Scanner;

public class LogicalOperatorsTask2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter quiz");
		int score=scan.nextInt();
		System.out.println("Please enter midTerm");
		int score1=scan.nextInt();
		System.out.println("Please enter finalScore");
		int score2=scan.nextInt();
		
		if(score>=90) {
			System.out.println("Your grade is A");
		}else if(score>=70 && score<90) {
			System.out.println("Your grade is B");
		}else if(score>=50 && score<70) {
			System.out.println("Your grade is C");
		}else if(score<50){
			System.out.println("Your grade is F");
		}else {
			System.out.println("Unknown grade");
		}
	}
}
