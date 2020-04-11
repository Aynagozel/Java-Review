package com.Interview1;

public class IQ6 {
	public static void main(String[] args) {
		/*Write a Java Program to find whether a String is palindrome or not?
		 * of reversed string and original string are same--> string is palindrome
		 * mom, dad, madam racecar, kayak bob
		 * Logic:
		 * Step1: reverse the string
		 * step2: compare 2 strings:
		 * if strings are equal -> palindrome
		 * else --> not palindrome
		 */
		String original="kayak radar kayak";
		String reversed="";
		//5-1=4-1
		for(int i=original.length()-1; i>=0; i--) {
			reversed=reversed+original.charAt(i);//""+k=k=a=ka+k
		}
		System.out.println(reversed);
		
		if(original.equals(reversed)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is NOT palindrome");
		}
	}
}
