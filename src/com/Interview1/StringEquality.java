package com.Interview1;

public class StringEquality {
	public static void main(String[] args) {
		String str="Hello";
		String str1="Hello";
		
		String str2=new String("Hello");
		String str3=new String("Hello");
		
		System.out.println(str.equals(str1));//true
		System.out.println(str.equals(str2));//true
		
		System.out.println("---------------");
		
		System.out.println(str==str1);// true
		System.out.println(str==str2);//false
	}
}
