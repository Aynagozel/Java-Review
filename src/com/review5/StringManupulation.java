package com.review5;

public class StringManupulation {
	
	public static void main(String[] args) {
		
		String str ="Hello";
		
		System.out.println(str.length());
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		System.out.println(str.equals("hello"));
		
		System.out.println(str.equalsIgnoreCase("hello"));
		
		System.out.println(str.contains("LL"));
		
		//boolean result =str.startsWith("he");
		//System.out.println(result);
		
		System.out.println(str.startsWith("Hello"));
		
		System.out.println(str.endsWith("llo"));
		
		String b="LL";
		
		//str.toLowerCase().contains(b);
		
		String str1="";
		
		str1.isEmpty();
		
		System.out.println("Empty: " +str1.isEmpty());
		
		System.out.println(str1.isEmpty());
		
		//String str3 =str + " " +" World ";
		//String str3=str.concat(" ").concat("World ");.trim.concat("Bodies");
		String str3=str.concat(" ").concat("World ");
		System.out.println(str3);
		
		String str4= str3.trim().concat(" Bodies");
		System.out.println(str4);
		
		char result =str.charAt(3);
		
		System.out.println(result);
		
		String newStr = "" + str.charAt(0)+ str.charAt(2) + str.charAt(1);
		System.out.println(newStr);
		
		System.out.println(str.indexOf('l'));
		System.out.println(str.indexOf("ll"));
		
		String str5 = " klmhjn";
		System.out.println(str5.indexOf("h", 4));
		
		System.out.println(str5.indexOf("j"));
		
		
		
		
		
		
		
		
		
	}
}
