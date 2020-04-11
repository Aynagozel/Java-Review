package com.rewrite2;

public class DiffrentStyleForLoop {
	public static void main(String[] args) {
		
	
	for(int i=0;i<100; i++) {
		if(i%3==0 && i%3==7) {
			
		}
		System.out.println(""+i);
		
	}
	for(int i=1; i<100; i++) {
		if(i%21==0) {
			System.out.println(""+i);
		}
	}
	for(int i=0; i<4; i++) {
		System.out.println(((i+1)*21));
	}
	for(int i=1; i<100; i*=2) {
		System.out.println(i);
	}
	int total=1;
	for(int i=0; i<=7;i++) {
		total=total*2;
		System.out.println(total);
		
		
	}
	//how write if without curly bracet because we have only one if
	for(int i=1; i<=5; i++) {
		if(i%5==0) 
			System.out.println(i);
		
	}
}
}