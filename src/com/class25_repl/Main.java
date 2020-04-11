package com.class25_repl;

public class Main {
	static void method() {
		System.out.println("method without parameter");
	}
	static void method(int a) {
		System.out.println("method with int parameter");
	}
	public static void main(String[] args) {
		method();
		method(10);
	}
}
