package com.repl_8;

public class Main9 {
	void add(int a, int b ) {
		System.out.println("Addition "+(a+b));
	}
	void mult(int a, int b) {
		System.out.println("Multiplication "+(a*b));
	}
	void sub(int a, int b) {
		System.out.println("Subtraction "+(a-b));
	}
	public static void main(String[] args) {
		Main9 obj=new Main9();
		obj.add(15,15);
		obj.mult(5, 6);
		obj.sub(30, 10);
	}
}
