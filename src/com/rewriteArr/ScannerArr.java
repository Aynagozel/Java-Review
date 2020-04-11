package com.rewriteArr;

import java.util.Scanner;

public class ScannerArr {
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	String[]arr=new String[7];
	for(int i=0; i<arr.length; i++) {
		System.out.println("Please enter day "+(i+1)+" of the week");
		arr[i]=scan.next();
	}
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	}
	
}
