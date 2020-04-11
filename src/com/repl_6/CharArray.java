package com.repl_6;

import java.util.Scanner;

public class CharArray {
	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	System.out.println("In:");
	String word=scan.nextLine();
	char[]ch=word.toCharArray();
	for(int i=0; i<ch.length; i+=2) {
		System.out.print(ch[i]);
	}
	System.out.println("========");
	System.out.println("In:");
	String word1=scan.nextLine();
	for(int i=0; i<word.length()-1;i++) {
		System.out.println(word.charAt(i++));
	}
	
	}
}
