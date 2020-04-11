package com.rewrite;

import java.util.Scanner;

public class Task11 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter numbers your annual salary");
		int annual = keyboard.nextInt();
		System.out.println("Please enter your salary");
		int salary = keyboard.nextInt();

		if (annual >= 5) {
			System.out.println("You are eligible for the bonus");

			if (salary > 50000) {
				System.out.println("and your bonus is =5000 ");
			} else {

				System.out.println("bonus=3000");
			}
		} else {
			System.out.println("You are not eligible");
		}

	}
}
