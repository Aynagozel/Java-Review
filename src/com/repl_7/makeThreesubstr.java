package com.repl_7;

public class makeThreesubstr {
	public static String makeThreeSubstr(String word, int startIndex,int endIndex) {
		String returnValue="";
		for(int i=0; i<=2; i++) {
			returnValue+=word.substring(startIndex,endIndex);
		}
		return returnValue;
	}
	public static void main(String[] args) {
		String firstValue=makeThreeSubstr("hello",0,2);
		System.out.println(firstValue);
		String secondValue=makeThreeSubstr("shenanigans",3,7);
		System.out.println(secondValue);
	}
}
