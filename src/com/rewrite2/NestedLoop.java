package com.rewrite2;

public class NestedLoop {
	public static void main(String[] args) {
		
		for(int i=1; i<=3; i++) {
			System.out.println("I am outer!! loop");
			for(int j=1; j<=4; j++) {
				System.out.println("I am inner loop");
			}
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=0; j<=5; j++) {
				System.out.println(i+" "+j);
			}
		}

	}
}
