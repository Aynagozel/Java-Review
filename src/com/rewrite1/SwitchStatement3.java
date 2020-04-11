package com.rewrite1;

import java.util.Scanner;

public class SwitchStatement3 {
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the age of the child");
		 int age=scan.nextInt();
		 String response;
		 switch(age) {
		 case 1:
			 response="You can crawl";
			 break;
		 case 2:
			 response="You can Talk";
			 break;
		 case 3:
			 response="You can Dance";
			 break;
		 case 4:
			 response=" You can get Trouble";
			 break;
		 default:
			 response="I don't know how old you are";
		
		 }
		 System.out.println(response);
		 
	}
}
