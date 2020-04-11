package com.repl_7;

public class MethodChar {
	public static char getChar(String word, int index) {
		return word.charAt(index);
	}
	public static void main(String[] args) {
		System.out.println(getChar("hello",1));
	}
}
