package com.rewriteArr;

import java.util.Scanner;

public class ScannerArr1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[]arr=new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]*10);
		}
		System.out.println("))))))))))");
		int[]arr1={45,78, 12,  67, 55, 89, 23, 77, 88};
		for(int i=0; i<9; i+=3) {
			System.out.println((arr1[i]/i));
		}
	}
}
