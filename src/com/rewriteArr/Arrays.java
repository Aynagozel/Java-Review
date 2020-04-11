package com.rewriteArr;

public class Arrays {
	public static void main(String[] args) {
		int[]arr= {45,78,12,67,55};
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("******");
		int[]arr1= {45,78,12,67,55,89,23,77,88};
		for(int i=0; i<arr1.length;i+=2) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println("--------------");
		char[]arr2= {'s', 'a', 'y',  'b', 'n', 'c', 't',  'd', 'a', 'e', 'x'};
		for(int i=0; i<=arr2.length-1; i+=2) {
			System.out.print(arr[i]);
		}
	}
}
