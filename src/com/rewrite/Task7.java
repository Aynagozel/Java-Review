package com.rewrite;

public class Task7 {
	public static void main(String[] args) {

		boolean diploma = true;

		double gpa = 3.5;

		if (diploma) {
			System.out.println("I can say congratulations!");
		} else {
			System.out.println("You can get a degree");
			if (gpa >= 3.5) {
				System.out.println("You are eligible for scholorship");
			} else {
				System.out.println("You shoul have studied harder");
			}
		}
	}
	
	
}
