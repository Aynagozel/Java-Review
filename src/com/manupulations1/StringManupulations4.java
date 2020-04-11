package com.manupulations1;

public class StringManupulations4 {
	public static void main(String[] args) {
		/*
		 * This method checks whether a String is empty or not.
		 * This method returns true if the given string
		 * is empty, else it returns false.
		 */
		String str="";
		System.out.println("Is this string empty= " +str.isEmpty());
		String str2="Hello";
		System.out.println("Is this string empty=" +str2.isEmpty());
		
		System.out.println();
		if(!str.isEmpty()) {
			System.out.println("This is not empty");
		}else {
			System.out.println("This is empty String");
		}
		String sentence=" Each day has a promise to brigthen up the day,/nBut first you must allow to come your way";
		System.out.println(sentence);
		System.out.println("===============");
		/*
		 * This method appends to the String to the end of another.
		 * The method returns a String with the valuer of the String passed in to the method appended
		 * to the end of the String used to invoke thios method
		 */
		String str3="Hello";
		String str4="World";
		String str5="People";
		System.out.println(str3+str4+str5);
		System.out.println(str3.concat(str4).concat(str5));
		System.out.println("===============");
		/*
		 * This method returns a copy of the string,
		 * with leading and trailing whitespace omitted.
		 */
		String str6="How are you? ";
		System.out.println(str6.trim());
	}
}
