package com.rewrite2;

public class Task {
	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			System.out.print(" "+i);
		}
		for(int i=101; i>=1; i--) {
			System.out.println(i);
		}
		//print numbers from 20 to 1in 2 ways
		for(int i=20; i>=1;i-=2) {
			System.out.println(i);
		}
		for(int i=20; i>=0; i--) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		for(int i=21; i<=50; i+=2) {
			System.out.println(i);
		}
		for(int i=20; i<=50; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		int Even=0;
		int Odd=0;
		for(int i=1; i<=20; i++) {
			if(i%2==0) {
				Even=Even+ i;
		}else {
			Odd=Odd+ i;
		}
			System.out.println("The total of the Even #=" +Even);
			System.out.println("The total of the Odd #= "+Odd);
	}
}
}