package com.repl_8;

import java.util.Scanner;

public class LogicalOperators4 {
	public static void main(String[] args) {
		String drink;
		Scanner scan=new Scanner(System.in);
		System.out.println("Are you thirsty?");
		boolean thirsty=scan.nextBoolean();
		System.out.println("Are you sleepy");
		boolean sleepy=scan.nextBoolean();
		
		if(!(sleepy && thirsty)) {
			drink="Water";
		}else if(thirsty && sleepy) {
			drink="coffe";
		}else if(!(thirsty && sleepy)) {
			drink="Tea";
		}else {
			drink="Nothing";
		}
		System.out.println("Looks like you need "+drink);
	}
}
