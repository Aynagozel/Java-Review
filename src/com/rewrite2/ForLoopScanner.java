package com.rewrite2;

import java.util.Scanner;

public class ForLoopScanner {
	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Int:");
	int end=scan.nextInt();
	
	for(int i=0; i<end*2; i++) {
		System.out.print(i+ " ");
	}
	}
}
