package com.repl_6;

import java.util.Scanner;

public class ManipulationForLoopWithScanner {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("In:");
		String word=sc.nextLine();
		for(int i=0; i<=word.length()-1;i++) {
			System.out.println(word.charAt(i));
	}
		System.out.println("================");
		
		 Scanner inp = new Scanner(System.in);
		  System.out.print("In:");
		  String word1=inp.nextLine();
		  char[]ch=word.toCharArray();
		  for(int i=0; i<ch.length; i++) {
			  System.out.println(ch[i]);
		  }
		     
}
}
