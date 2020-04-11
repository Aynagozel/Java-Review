package com.Interview1;

public class StringManipulations {
	public static void main(String[] args) {
		//String class comes in java lang package
		
		// way to create a String
		//first way to create a String
		String str="Hello";
		//second way using new keywords- creating a String object
		String str1=new String("Hello");
		System.out.println(str);
		System.out.println(str1);
		//find the number of characters inside the String
		int length=str.length();
		System.out.println(length);
		//case conversation methods functions
		str=str1.toLowerCase().toUpperCase();//HELLO
		System.out.println(str);//HELLO
		
		//verify if there if the string is empty
		String myString="";//empty value
		boolean isEmpty=myString.isEmpty();
		System.out.println(isEmpty);
		
		//String myString1=null;//no value at all it is equal to
		//String myString;
		//System.out.println(myString1.isEmpty());
		//how to verify existence of characters in the string
		String a="Good evening students";
		boolean exist=a.contains("student");
		System.out.println(exist);
		System.out.println(a.startsWith("Good"));
		System.out.println(a.endsWith("students"));
	}
}
