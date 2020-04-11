package com.repl_8;

import java.util.Scanner;

public class NestedIfPromptQuestion {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean isSunny = scan.nextBoolean();

		if (isSunny) {
			int temperature = scan.nextInt();
			System.out.println("It is a sunny day, I should go somewhere!");
			if (temperature > 85) {
				System.out.println("I am going to the beach!");
			} else {
				System.out.println("I am going to park!");
			}

		} else {
			System.out.println("I stay home and practice Java!");
		}

	}
}
