package com.manupulation;

public class RegularExpresion {
	public static void main(String[] args) {
		/*
		 * print only text and nut numbers
		 */
		String str="1234Hel45645lo465456";//hello
		System.out.println(str.replaceAll("[0-9]", ""));//Leave only text/hello
		System.out.println("=============");
		
		System.out.println(str.replaceAll("[a-zA-Z]", ""));//Leave only numbers/ 1223444
		System.out.println("=============");
		
		//Remove everything except text and numbers
		
		String str2="Hi#$%How#$%#$4356346";
		System.out.println(str2.replaceAll("[^a-zA-Z0-9]", ""));
	}
}
