package com.practicee;

public class calss1 {
	
	public static void main(String[] args) {
	
	int age =55;
	
	if (age<16) {
		System.out.println(" You are too young to drive");
	}else {
		System.out.println("You are eligible");
		
		if(age>=18) {
			System.out.println(" you can drive alone");
		}else {
			System.out.println(" you need your parents to drive");
		}
	}
	
	boolean quiz=true;
	int score=79;
	
	if(quiz) {
		System.out.println(" Good job you tried to do your quiz!!!");
		if(score>90) {
			System.out.println("You got an A");
		}else if(score>80) {
			System.out.println("You got an b");
		}else {
			System.out.println("You should study more");
		}
	}else {
		System.out.println(" Not good!!!");
	}
	
	boolean isFriday=false;
	int day =31;
	// if day is Friday only day I want to check
	if(isFriday) {
		System.out.println(" Today is Friday");
		if(day ==13) {
			System.out.println("I will watch scary movie");
		}else {
			System.out.println("I will watch comedy");
		}
	}else {
		System.out.println(" Today is NOT Friday");
	}
}
}
