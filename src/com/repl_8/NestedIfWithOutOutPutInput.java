package com.repl_8;

import java.util.Scanner;

public class NestedIfWithOutOutPutInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String gender = scan.next();
		int age = scan.nextInt();

		if (age > 25) {
			if (gender.equals("F")) {
				System.out.println("Woman");
			} else {
				System.out.println("Man");
			}
		} else {
			if (gender.equals("M")) {
				System.out.println("Boy");
			} else {
				System.out.println("Girl");
			}
		}

	}
}