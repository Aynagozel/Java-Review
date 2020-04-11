package com.Interviewq;

public class Questions6 {
	public static void main(String[] args) {
		
		// To Do/ Auto- generated method stub
		
		
		
		
		String s=" anastasmumsatsana";
		String b="";
		
		for(int j=s.length()-1; j >=0; j --) {
			b=b+s.charAt(j);
		}
		
		if(s.equalsIgnoreCase(b)) {
			System.out.println(" This string is a palindrom");
		}else {
			System.out.println("This srting isNOT palindrome");
		}
	}
}
