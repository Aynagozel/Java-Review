package com.rewrite1;

import java.util.Scanner;

public class DoubleValue {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter double value");
		double value1=scan.nextDouble();
		System.out.println("Please enter double value");
		double value2=scan.nextDouble();
		System.out.println("Please enter double value");
		double value3=scan.nextDouble();
		
		if(value1>value2 && value1>value3) {
			System.out.println("Largest value is "+value1);
		}else if (value1>=value3 && value2>=value3) {
			System.out.println("Largest value is "+value2);
		}else if(value3>=value2 && value3>value2) {
			System.out.println("Largest value is "+value3);
		}else {
			System.out.println("Largest value is "+value3);
		}
	}
}
