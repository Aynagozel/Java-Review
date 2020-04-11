package com.manupulations1;

public class stringManupulations5 {
	public static void main(String[] args) {
		/*This methos returns the character located at the String's specified
		 * the string indexes starts from zero.
		 */
		String str7=" We might be done early today";
		System.out.println(str7.charAt(3));
		System.out.println("============");
		/* This method returns the index within this string of the
		 * first occurence of the specified character or -1
		 * if the character does not occur.
		 */
		String str8="We might not be done early ";
		System.out.println(str8.indexOf('m'));
		System.out.println((str8.indexOf('z',0)));
	}
}
