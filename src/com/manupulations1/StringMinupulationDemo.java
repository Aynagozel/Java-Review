package com.manupulations1;

public class StringMinupulationDemo {
	public static void main(String[] args) {
		// There are two ways to create string objects.
		//1
		//String Literal
		String name="john";
		System.out.println(name);
		System.out.println("The length of name is = "+name.length());
		//2
		//Creating String with new key word
		System.out.println("=========");
		String name1=new String("John1");
		System.out.println(name1);
		/*
		 * This method returns the length of this String
		 * the length is equal to the number
		 * of 16-bit Unicode characters in the string.
		 */
		int name1len=name1.length();
		System.out.println("The name1 is = "+name1len);
		System.out.println("=========================");
		/*
		 * toLowerCase();
		 * This method converts all of the charactes in this string to lowrecase
		 * 
		 */
		String str1="HeLlO woRlD";
		System.out.println("Before:: "+str1);
		str1=str1.toLowerCase();
		System.out.println("Afrer:: "+str1);
		System.out.println("=================");
		//.equals();
				//This method will count everything such
				//capitalations and content
				String str2="HeLlo WoRld";
				boolean isEquals=str1.equals(str2);;
				System.out.println(isEquals);
				//.equalsIgnoreCase();
				//This method does not care for capitalization and compare the
				//content only
				System.out.println(str1.equalsIgnoreCase(str2));
				/*toUpperCase();
				 * This method converts all of the characters in this String toUpperCase
				 */
				
			}
	}

