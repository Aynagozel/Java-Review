package com.repl_7;

public class Main10 {
	public int addTwo(int x, int y) {
		int c=x+y;
		return c;
	}
	public static void main(String[] args) {
		Main10 obj=new Main10();
		int d=obj.addTwo(20,5);
		System.out.println(d);
	}
}
