package com.manupulations1;

public class StringCharArray {
	public static void main(String[] args) {
		String str="Syntax Technologies";
		char[]array=str.toCharArray();
		for(char i:array) {
			System.out.print(i+" ");
		}
		System.out.println("==========");
		String str1="Welcome To Syntax Solutions" ;
	    //char characters=str1.charAt(24);
	   // System.out.println(characters);
	    for(int i=0; i<str1. length(); i++){
	      System.out.println(str1.charAt(i));
	}
	    System.out.println("=============");
	    String str2="Welcome To Syntax Solutions" ;
	    char[] ch=str1.toCharArray();
	    for(int i=0;i<ch.length;i++){
	    System.out.println(ch[i]);
	    
	  }
}
}
