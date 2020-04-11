package com.Interviewq;

public class Questions4 {
	public static void main(String[] args) {
		// How to find out the part of the string from string?
		
		String str=" the wheels on the bus go round and round";
		boolean contains;
		
		System.out.println(str.contains("round"));
		System.out.println(str.contains("round and vound"));
		
		
		// What is a substring?
		System.out.println(" substring is a part of the string.");
		
		
		// Find number of words of string?
		
		String[]array=str.split(" ");
		
		System.out.println(array.length);
		
	}
}
