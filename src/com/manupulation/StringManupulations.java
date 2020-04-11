package com.manupulation;

public class StringManupulations {
	public static void main(String[] args) {
		//sunstring
		//This method returns a new string that is a substring of this string.
		String str="Java is getting interesting";
		System.out.println(str.substring(18));
		/*
		 * String substring(int beginsIndex, intendIndex)
		 * 
		 */
		System.out.println(str.substring(8,15));
	}
}
