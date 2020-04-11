package com.class25_repl;

public class Main2 {
	public static void main(String arg1) {
		System.out.println("main "+arg1);
	}
	public static void main(String arg1, String arg2) {
		System.out.println("main "+arg1+" "+arg2);
	}
	public static void main(String[] args) {
		main("Syntax");
		main("Syntax","Solutions");
	}
}
