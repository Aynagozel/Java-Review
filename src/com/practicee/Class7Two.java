package com.practicee;

public class Class7Two {
	public static void main(String[] args) {
		int num=10; 
		while (num<=7) {
			System.out.println("hello");
			num++;
		}
	
		int num1 =10;
		do {
			System.out.println("Bye");
			num1++;
		
	}while(num1<=7);

	int even=20;
	do {
		System.out.println(even);
		even +=2;
	}while(even <=50);
	System.out.println(even);

	
	int even1=20;
	do {
		if(even1 % 2 ==0) {
			System.out.println(even1);;
		}
		even1++;
	}while(even1<=50);
}
}