package com.repl_8;

import java.util.Scanner;

public class LogicalOperators2 {
	public static void main(String[] args) {
	
		String output;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter two strings");
		String word1=scan.nextLine();
		String word2=scan.nextLine();
		System.out.println("Please enter two numbers");
		int int1=scan.nextInt();
		int int2=scan.nextInt();
		
		if(word1.equals(word2) && int1==int2) {
			System.out.println("AND");
		}else if(word1.equals(word2)|| int1==int2) {
			System.out.println("OR");
		}else if(!(word1.equals(word2)) && int1!=int2) {
			System.out.println("NONE");
		}else {
			System.out.println("Unknown");
		}
	
		if(word1.equals(word2) && int1==int2) {
			output="AND";
		}else if(word1.equals(word2)|| int1==int2) {
			output="OR";
		}else if(!(word1.equals(word2) && int1!=int2)){
			output="NONE";
		}else {
			output="Unknown";
		}
		System.out.println(output);
		
		
	}

	
}
