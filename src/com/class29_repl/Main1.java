package com.class29_repl;

public class Main1 extends Parent1 {
	void m1() {
		System.out.println("abstract method1 implementation in main class");
	}
	public static void main(String[] args) {
		Parent d=new Main();
		d.m1();
		d.m2();
	}
}
