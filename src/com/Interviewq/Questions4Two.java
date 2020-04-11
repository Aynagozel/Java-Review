package com.Interviewq;

public class Questions4Two {
	public static void main(String[] args) {
		String str = "We are Code Busters";
	    System.out.println( str.substring(0,5) + "" + str.substring(5,9));
	    String[] array = str.split("\\ ");
	    System.out.println( array.length);
	}
}
