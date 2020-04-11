package com.rewriteArr;

public class Arrays1 {
	public static void main(String[] args) {
		char[] arr = {'s', 'a', 'y',  'b', 'n', 'c', 't',  'd', 'a', 'e', 'x'};
		for(int i=0; i<arr.length; i+=2) {
			System.out.print(arr[i]);
		}
		System.out.println("****************");
		
		String[] arr1 = {"This", "is", "array", "of", "strings"};
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+" ");
		}
	}
}
