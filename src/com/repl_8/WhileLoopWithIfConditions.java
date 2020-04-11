package com.repl_8;

public class WhileLoopWithIfConditions {
	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			if(i!=7 && i!=8 && i!=9 && i!=5) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("___________________________");
		
		int a=7;
		while(a<=98) {
			System.out.println(a);
			a=a+7;
		}
		System.out.println("?????????????????");
		
		int b=4;
		while(b<=97) {
			System.out.println(b);
			b=b+4;
		}
	}
}
