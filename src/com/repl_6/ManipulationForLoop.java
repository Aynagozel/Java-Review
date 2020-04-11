package com.repl_6;

import java.util.Scanner;

public class ManipulationForLoop {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("In:");
		String word=scan.nextLine();
		char[]ch=word.toCharArray();
		for(int i=0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
	}
}
