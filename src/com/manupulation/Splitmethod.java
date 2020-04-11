package com.manupulation;

public class Splitmethod {
	public static void main(String[] args) {
		// how to seperate comma delimited string.
		
		String str="if you come to class early, then you can study more "
				+ "and you can leave early";
		
		String[]arr=str.split(" , ");
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("===============");
		String str1="Welcome To Syntax Technologies";
		String[]arr1=str1.split(" "+ "To",0);
		System.out.println(arr1.length);
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
				
	}
}
