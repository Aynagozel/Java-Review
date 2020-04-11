package com.rewrite2;

public class NestedPattern {
	public static void main(String[] args) {
		//*****
		for(int i=1; i<=5;i++) {
			System.out.print(" * ");
		}
		System.out.println();
		//*****
		//*****
		//*****
		//*****
		
		for(int i=1; i<=5; i++) {
			System.out.print(" * ");
			
		}
		System.out.println();
		System.out.println(")))))))))))))))");
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
		for(int i=0; i<10;i++) {//rows
			for(int y=0; y<10; y++) {//cols
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
