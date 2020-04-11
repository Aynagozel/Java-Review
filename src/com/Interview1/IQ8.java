package com.Interview1;

public class IQ8 {
	public static void main(String[] args) {
		//Fobonacci
		// 1 1 2 3 5 8 13 21
			//a b c
			  // a b c
			    // a b c
		int a=1;
		int b=1;
		int c;
		System.out.println(a);
		System.out.println(b);
		for(int i=0; i<10; i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		System.out.println("===========");
		
		int a1, b1, c1;
		a=0;
		b=1;
		for(int i=0; i<10; i++) {
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
}
