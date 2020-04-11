package com.manupulation;

public class Task2ReverseOrderAndMiddle {
	public static void main(String[] args) {
		/*
		 * Create a String and print it in reverse order(Sunday --> yadnaS).
		 */
		String day ="Sunday";
		//System.out.println(day.charAt(5)+""+day.charAt(4)+""+day.charAt(3)+""+day.charAt(2)+""+day.charAt(1)+""+day.charAt(0));
		System.out.println(day.length());
		
		for(int i=day.length()-1;i>=0; i--) {
			System.out.print(day.charAt(i));
			/*
			 * Create a String and if the String is not empty perform the following: if the
			 * String has ann odd number of  characters and has 3 or more characters print
			 * the character in the middle if the String.
			 */
			System.out.println("=====");
			 
			String str1="Helloorwewr";
			int length=str1.length();
			int middle=str1.length()/2;
			System.out.println();
			if(!str1.isEmpty()) {
				if(length%2!=0 && length>=3) {
					System.out.println(str1.charAt(middle));
				}
			}
		}
	}
}
