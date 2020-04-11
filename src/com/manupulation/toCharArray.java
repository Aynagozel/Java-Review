package com.manupulation;

public class toCharArray {
	/*
	 * .toCharArray
	 * This method converts this string to a new character array.
	 */
	public static void main(String[] args) {
		
	
	String str="Syntax Technologies";
	char[]array=str.toCharArray();
	for(char i:array) {
		System.out.println(i);
	}
	System.out.println("======");
	String str1="Syntax Technologies";
	char[]array1=str.toCharArray();
	for(char i: array) {
		System.out.print(i);
	}
	
}
}
