package com.class25_repl;

public class Main1 {
	void method1(int a) {
		System.out.println(a);
	}
	void method1(String ss) {
		System.out.println(ss);
	}
	void method1(double dd) {
		System.out.println(dd);
	}
	void method1(float ff) {
		System.out.println(ff);
	}
	public static void main(String[] args) {
		Main1 d= new Main1();
		d.method1(100);
		d.method1("SyntaxSolutions");
		d.method1(100.09);
		d.method1(200.0998);
		
		
	}
}
