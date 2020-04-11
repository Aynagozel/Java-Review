package com.rewrite1;

public class BooleanAndWhile {
	public static void main(String[] args) {
		/*
		 * Create a boolean variable workDay and assign true create int
		 * variable day and assign it to 1 as long as it workDay print and increase
		 * day. Once day is 6 print
		 */
		
		boolean workDay=true;
		int day=1;
		
		while(workDay) {
			if(day==6 || day==7) {
				workDay=false;
				System.out.println("I do not need a day off anymore");
			}else {
				System.out.println("I need a day off");
			}
			day++;
		}
	}
}
