package com.manupulation;

public class SplitMethods {
	public static void main(String[] args) {
		/*.split()
		 * This method splits this string around of given regular expression.
		 */
		//split the following string into array of strings/work
		String str="Video provides a powerful way to help you to your piont.";
		String[]array=str.split("\\s");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("=============");
		// How can we find how many sentences are in the following string;
		String str1="Today is Sunday. its sunny day. and we are having java class";
		String[]arr=str1.split("\\.");
		System.out.println("The number of sentences in the given string is::"+arr.length);
		System.out.println("===================");
		for(String string:array) {
			System.out.println(string);
		}
	}
}
