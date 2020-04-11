package com.manupulations1;

public class StringManupulationsDemo2 {
	public static void main(String[] args) {
		/*
		 * .contains();
		 * This searches the sequence if charactesrs in the string
		 *if the characters are found,then it returns true otherwise returnds false
		 */
		String sentence ="It was raining";
		String sen="raining";
		System.out.println(sen.contains("was"));
		
		// Create two string and initilize them with some value.
		//inmpilemt with following methods on those strings.
		/*
		 * sen.length().
		 * sen.equals();
		 * sen.contains(s);
		 * sen.toUpperCase();
		 *sen.toLowerCase();
		 *senequalsIgnoreCase(onotherString);
		 */
		System.out.println("************************");
		/*
		 * This method tests is a string starts with the spesified prefix begining
		 */
		String str2="It is very hot in the class";
		System.out.println("Is this string starts with = "+str2.startsWith("is",3));
		System.out.println("==============="); 
		/*
		 * This method tests if this string ends with
		 * the spesified suffix.
		 */
		System.out.println("Is this string ends with = "+str2.endsWith("class"));
	}
}
