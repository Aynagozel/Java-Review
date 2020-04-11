package com.Interview1;

public class IQ5 {
	public static void main(String[] args) {
		
		//Reverse a string word by word?
		String given ="Welcome to the Java class";
		/*
		 * to reverse string split(); Step1: split--> array of Strings Step2: use for
		 * loop and use decrement to print values
		 */
		String reversed="";
		String[]str=given.split("\\s");
		for(int i=str.length-1; i>=0; i--) {
			reversed=reversed+str[i]+" ";
		}
		System.out.println(reversed);
		
		System.out.println("--------------------------");
		//Write a Java program to reverse String?
		//toCharArray();charAt();
		String given1="Today is java class";
		String replaced1="";
		char[]charArray=given1.toCharArray();
		for(int i=charArray.length-1; i>=0; i--) {
			replaced1=replaced1+charArray[i];
		}
		System.out.println(replaced1);
	System.out.println("------------------------------");	
	
		System.out.println("-----Using charAt----");
		String Word3="I love Java";
		String reversed2="";
		for(int i=Word3.length()-1; i>=0; i--) {
			reversed2=reversed2+Word3.charAt(i);
		}
		System.out.println(reversed2);
	}
}
