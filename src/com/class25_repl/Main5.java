package com.class25_repl;

public class Main5 {
	final void m1(boolean value) {
		System.out.println("Final method with boolean parameter");
	}
	final void m1(String value) {
		System.out.println("Final method with String parameter");
	}
	public static void main(String[] args) {
		Main5 d = new Main5();
		d.m1(false);
		d.m1("Syntax");
	}
}
