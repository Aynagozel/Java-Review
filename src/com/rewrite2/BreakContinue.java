package com.rewrite2;

public class BreakContinue {
	public static void main(String[] args) {
		// break keyword breaks/exists the loop
		for(int i =0; i<10; i++) {
			if(i==2) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("*******************");
		//continue - it will skip current iteration
		for(int i =1; i<=5; i++) {
			if(i==3 || i ==4) {
				continue;
			}
			System.out.println(i);
		}
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		// i want to print nums from 1 to 20 except 5,6,7
		for(int a =1; a<=20; a++) {
			if(a>=5 && a<=17) {//5
				continue;
			}
			System.out.println(a);
		}
	}
}
