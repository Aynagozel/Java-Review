package com.class29_repl;

public class Main2 extends Parent2 {
	void m1() {
		System.out.println("abstract method1 implementation without argument in main class");
	}
	void m1(int a) {
		System.out.println("abstract method2 implementation with argument in main class");
	}
	public static void main(String[] args) {
		 Parent2 d= new Main2();
		 d.m1();
		 d.m1(100);
	}
}
