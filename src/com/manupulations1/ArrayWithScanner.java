package com.manupulations1;

import java.util.Scanner;

public class ArrayWithScanner {
	public static void main(String[] args) {
		int[]arr= {2,5,4,7};
		for(int i: arr) {
			System.out.println(i);
		}
		System.out.println("===================");
		int[]arr1=new int[5];
		Scanner scan=new Scanner(System.in);
		for(int i=0; i<arr1.length; i++) {
		arr1[i]=scan.nextInt();
		
	}
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
}
}