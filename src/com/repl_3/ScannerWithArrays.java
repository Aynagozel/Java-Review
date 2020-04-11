package com.repl_3;

import java.util.Scanner;

public class ScannerWithArrays {
	public static void main(String[] args) {
		 Scanner scan =new Scanner(System.in);
		 int[]arr=new int[5];
		  for(int i=0; i<arr.length; i++) {
			  arr[i]=scan.nextInt();
		  }
		  for(int i=0; i<arr.length; i++) {
			  System.out.println(arr[i]*10);
		  }
			 
	}
}