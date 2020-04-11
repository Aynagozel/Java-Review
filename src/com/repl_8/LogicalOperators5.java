package com.repl_8;

import java.util.Scanner;

public class LogicalOperators5 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Is it weekend?");
		boolean weekend=scan.nextBoolean();
		String subject;
		
		if(!(weekend)) {
			subject="Manual testing";
		}else {
			subject="Java";
		}
		System.out.println("Today you will be learning "+subject);
	}
}
