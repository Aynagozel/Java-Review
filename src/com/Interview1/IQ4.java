package com.Interview1;

public class IQ4 {
	public static void main(String[] args) {
		/*
		 * How to find out the part of the strin from a string?
		 * What is substring?
		 * Find number of words in string?
		 */
		String str="Today is very cold outside";
		String substring=str.substring(0,5);
		System.out.println(substring);
		/*
		 * Step1: split based on the space --> array of String
		 * Step2: find the length of an array
		 */
		System.out.println(str);
		String[]words=str.split(" ");
		System.out.println("Length of an array is "+words.length+" words");//split as a delimeter it shows as how many words are there
	}
}
