package com.class25_repl;

public class Main3 {
	private void m1() {
		System.out.println(" private m1 method");
	}
	private void m1(int a) {
		System.out.println("private method with m1 int parameter");
		
	}
	public static void main(String[] args) {
		Main3 d=new Main3();
		d.m1();
		d.m1(10);
	}

}
