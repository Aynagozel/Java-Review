package com.rewrite1;

import java.util.Scanner;

public class FindLargestNumber {
	public static void main(String[] args) {
		
		//Task 2 find the largest number using nested if
		
		//To find 3 distinct number for nested if
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter 3 distincy number");
		
		double n1=scan.nextDouble();
		double n2=scan.nextDouble();
		double n3=scan.nextDouble();
		// true or false
		if(n1!=n2 || n2!=n3) {
			if(n1>n2) {
				if(n1>n3) { // n1>n2 && n1>n3
					
					System.out.println("Largest number is first "+n1);
					
				}else { // n1>n2 but n1<n3
					
					System.out.println("Largest number is third "+n3);
				}
			}else { // assuming n2>n1
				if(n2>n3) { //n2>n1 && n2>n3 --> n2= largest
					System.out.println("Largest number is second "+n2);
				}else { // n2>n1 but n2<n3
					
					System.out.println("Largest number is third "+n3);
				}
			}
				
			}else{
				System.out.println("Numbers are equal");
			}
		}
	
	}

