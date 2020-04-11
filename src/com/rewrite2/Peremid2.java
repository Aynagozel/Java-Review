package com.rewrite2;

public class Peremid2 {
	public static void main(String[] args) {
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		//2 pattern
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
	}
			System.out.println();
}
	for(int i=5; i<=1; i--) {
		for(int j=1; j<=i; j++) {
			System.out.println("*");
		}
		System.out.println();
	}
}
}