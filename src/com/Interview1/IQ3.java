package com.Interview1;

public class IQ3 {
	public static void main(String[] args) {
			/*
			 * Find out how many alpha characters/text present in a string?
			 */
		String str="Hello 6876868 *&^^, welcomegyggiugig!!!";
		str=str.replaceAll("[^A-Za-z]", "");//[0-9]/32
		System.out.println(str.length());
	}
}
