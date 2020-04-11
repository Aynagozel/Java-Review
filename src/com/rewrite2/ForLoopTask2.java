package com.rewrite2;

public class ForLoopTask2 {
	public static void main(String[] args) {
		/*
		 * write a code find the sum of even & odd numbers from range 1 to expecting 2 output sum for odd nums=... sum for even nums=...
		 */
		int sumEven=0;
		int sumOdd=0;
		
		for(int i=1; i<=20; i++) {
			if(i%2==0) {
				sumEven=sumEven+ i;
			}else {
				sumOdd=sumOdd+ i;
			}
			
		}
		System.out.println("The total of all even#= "+ sumEven);
		System.out.println("The total of all odd#= "+sumOdd);
		
		for(int i=0; i<10; i++) {
			System.out.println(""+(2*i));
		}
		for(int d=100;d>=1; d-=2) {
			System.out.print(" "+d);
		}
		for(int i=0; i<50; i++) {
			System.out.println((100-(2*i+1)));
		}
		for(int i=1; i<=6; i++) {
			System.out.println(i*3+" ");
		}
	}
}
