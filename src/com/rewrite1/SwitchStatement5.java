package com.rewrite1;

import java.util.Scanner;

public class SwitchStatement5 {
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter the roll number of the child");
		 int rollNumber=scan.nextInt();
		 
		 String answer;
		 
		 switch(rollNumber) {
		 case 101:
			 answer="Student name: Ramesh";
			 break;
		 case 102:
			 answer="Student name: Mahesh";
			 break;
		 case 103:
			 answer="Student name: Mukesh";
			 break;
		default:
			answer="Not found student name: in Class";
			 
		 }
		 System.out.println(answer);
	}
}
