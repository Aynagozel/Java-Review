package com.repl_7;

public class ReturnSubstr2 {
	static String makeThreeSubstr(String word, int startIndex, int endIndex) {
		String str=word.substring(startIndex,endIndex);
		return str+str+str;
	}
	public static void main(String[] args) {
		System.out.println(makeThreeSubstr("hello",0,2));
		System.out.println(makeThreeSubstr("shenanigans",3,7));
	}
}
