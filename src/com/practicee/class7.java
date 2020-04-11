package com.practicee;

public class class7 {
	public static void main(String[] args) {
		
		boolean workDay=true;
		int day=1;
		
		while (workDay) {
			if (day==6 || day ==7) {
				workDay=false;
				System.out.println("I do not need a day off anymore");
			}else {
				System.out.println("I need a day off");
			}
			day++;
		}
		
		for(int i=0; i<10; i++) {
			if (i==2) {
				break;
			}
			System.out.println(i);
		}
		for(int i=1; i<=20; i++) {
			if(i>=5 && i<=17) {
				continue;
			}
			System.out.println(i);
		}
		
		int sumEven=0;
		int sumOdd=0;
		
		for(int i=1; i <=20;i++) {
			if (i % 2==0) {
				sumEven=sumEven+ i;
			}else {
				sumOdd =sumOdd+i;
		
			}
			System.out.println("The toatal of all even#=" + sumEven);
			System.out.println("The total of all even#=" + sumOdd);
			
		}
		
	}
}
