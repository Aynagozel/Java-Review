package com.rewrite1;

public class WhileLopPractice2 {
	public static void main(String[] args) {
		int j=10;
	while (j<=1) {
			System.out.println(j);
			j--;
		}
			System.out.println("-------------");
			
			// print values from 50 to 20
			int b=50;
			while(b>=20) {
				System.out.println(b);
				b--;
			}
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
			// I want to print all even numbers from 1 to 20 inclusive
			//1 way- increment value by 2
			int q=2;
			
			while(q<=20) {
				System.out.println(q);
				q+=2;
			}
			System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
			// 2 way using modules
			int z=2;
			
			while(z<=20) {
				System.out.println(".");
				if(z%2==0) {
					System.out.println(z);
					
				}
				z++;
				
			}
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			//Print only odd number from 50 to 100
			// print only even numbers from 100 to 1
			
			int c=100;
			while(c>=50) {
				System.out.println(c);
				c-=2;
				
			}
			System.out.println("!!!!!!!!!!!!!!!!");
			
		int k=100;
		while(k>=1) {
			if(k%2==0) {
				System.out.println(k);
			}
			k--;
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^");
		
		int s=50;
		while(s<=100) {
			if(s%2==1) {
				System.out.println(s);
			}
			s++;
		}
		System.out.println(")))))))))))))))");
		int f=50;
		while(f<=100) {
			if(f%2==1)
			System.out.println(f);
		}
		f++;
		
	}
}
