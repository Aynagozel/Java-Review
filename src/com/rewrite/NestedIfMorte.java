package com.rewrite;

public class NestedIfMorte {

	public static void main(String[] args) {
		/*
		 * check age, if age less than 16 -->you are too young to drive otherwise -->
		 * you are eligible to drive & we will check if you are older than 18 --> you
		 * can get driver license and if not you can ger learning permit
		 */

		int age = 55;

		if (age < 16) {
			System.out.println("You are too young to drive");
		} else {
			System.out.println("You are eligible");
			if (age >= 18) {
				System.out.println("You can drive alone ");
			} else {
				System.out.println("You can get learning permit");
			}
			System.out.println("You need your parents to drive");

		}
		System.out.println("_________-------------------_________");
		/*
		 * we need to check if students complate the quiz if yes--> good job, if not-->
		 * not good if they complated we will check score: if more than 90--> you got an
		 * A if more than 80--> you got an B anything below --> you should study more
		 */
		boolean quiz = true;
		int score = 79;

		if (quiz) {
			System.out.println("Good job you tried to do quiz!!!");
			if (score >= 90) {
				System.out.println("You got an A");
			} else if (score > 80) {
				System.out.println("You got an B");
			} else {
				System.out.println("You should study more");
			}

		} else {
			System.out.println("Not good !!!");
		}
	}
}