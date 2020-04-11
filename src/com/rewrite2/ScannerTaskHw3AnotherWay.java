package com.rewrite2;

import java.util.Scanner;

public class ScannerTaskHw3AnotherWay {
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter start number");
		 int start=scan.nextInt();
		 System.out.println("Enter end number");
		 int end=scan.nextInt();
		 
		 int even=0;
		 int odd=0;
		 
		 if(start <=end) {
			 for(int i= start; i<=end; i++) {
				 if(i%2==0) {
					 even=even+i;
				 }else {
					 odd=odd+i;
				 }
			 }
			 System.out.println("The sum of even numbers is "+even);
			 System.out.println("The sum of odd numbers is "+odd);
			 
			 // else is an obtinal
		 }else {//num1 >num2
			 System.out.println("Please enter start# less then end number");
		 }
		 
	}
}
