package com.repl_7;

public class OppositeDoubleValue {
	static double negate(double num) {
		return(num-num)+(-num);
	}
	public static void main(String[] args) {
		System.out.println(negate(-2));
	}
}
