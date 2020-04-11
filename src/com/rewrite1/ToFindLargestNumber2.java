package com.rewrite1;

import java.util.Scanner;

public class ToFindLargestNumber2 {
	public static void main(String[] args) {

		// to find 3 distinct double number largest number using nested if
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter 3 distinct numbers");
		double d1 = scan.nextDouble();
		double d2 = scan.nextDouble();
		double d3 = scan.nextDouble();
// true or true
		if (d1 != d2 || d2 != d3) {
			if (d1 > d2 && d1 > d3) {
				System.out.println("Largest number is first " + d1);
			} else {
				System.out.println("Largest number is third " + d3);
			}
		}else {
			if(d2>d1 && d2>d3) {
				System.out.println("Largest number is second "+d2);
			}else {
				System.out.println("Largest number is third "+d3);
			}
			// I should put here else! if I want to say numbers are equals
		}
		System.out.println("Numbers are equals");
		}
		
		}


