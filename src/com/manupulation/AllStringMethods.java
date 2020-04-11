package com.manupulation;

public class AllStringMethods {
	public static void main(String[] args) {
		/*
		 * str.isEmpty();
		 *str.length();
		 *str. toUpperCase();
		 *str.toLowerCase();
		 *str.equals();
		 *str.equalsIgnoreCase():
		 *str.contains(s);
		 *startsWith(String prefix):
		 *endsWith(Srting suffix);
		 *concat(String str);
		 *str.trim();
		 *str.charAt(int index);
		 *str.indexOF(int ch)
		 */
		String city="FairFax";
		System.out.println(city.isEmpty());
		System.out.println(city.length());
		
		int[]a= {12,32,55,77};
		System.out.println(a.length);
		System.out.println(city);
		String city2=city.toUpperCase();
		System.out.println(city2);
	}

}
