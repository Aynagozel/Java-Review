package com.manupulation;

public class ReplaceMethodStringClass {
	public static void main(String[] args) {
		/*
		 * This method returns a new string rewsulting
		 * from replacing all accurances of oldChar
		 * in this strin with newChar.
		 */
		
		System.out.println("//\\");
		String str="Hello dear Dan, how are your Dan, How you been?";
		System.out.println(str.replace("Dan", "Ali"));
		System.out.println(str.replaceFirst("Ali", "Dan"));
		
		String str1="12-22-1990";//12/22/1090
		System.out.println(str1.replace('-', '/'));
		System.out.println(str1.replaceFirst("-","/"));//12/22-1990
		
	}
}
