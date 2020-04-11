package com.rewrite2;

import java.util.Scanner;

public class TaskWithScanner {
	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("Int start");
	int start=scan.nextInt();
	System.out.println("Int end");
	int end=scan.nextInt();
	
	for(int i=start; i<=end; i++) {
		for(int j=start; j<=end; j++) {
			System.out.print(j+" is an even number ");
		}
		System.out.println();
	}
	}
}
