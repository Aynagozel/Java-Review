package com.rewrite;

public class IfConditions {
	public static void main(String[] args) {
		
		int a=90;
		int b=300;
		//if number a is bigger than number b
		// I want to print a is larger than b
		if(a>b) {
			System.out.println(" a is larger than b");
		}else {
			System.out.println("a is smaller than b");
			
			int expectedHours=15;
			int actualHours=20;
			
			//if expected hours are more than actual -> you will succeed
			//otherwisew, please study more
			if(actualHours>expectedHours) {
				System.out.println("You will succeed");
			}else {
				System.out.println("Please study more");
			}
			
			double teaPrice=4.99;
			double allowedPrice=5.99;
			//teaPrice-=2///2.99=4.99-2
			
			//if price is more than that I can afford I will NOT buy
			//if price is less or matches what I can afford then I wiull buy tea
			System.out.println("I keep writing some code");
			System.out.println("I keep writing more code");
			
			boolean val=false;
			if(val){//if val ==true
				System.out.println("Hello");
			}else {
				System.out.println("Bye");
			}
			boolean isRain=true;
			//if it is raining I will take umbrella, otherwise I go for a walk
			if(isRain) {
				System.out.println("I will take an umbrella");
			}else {
				System.out.println("I go for a walk");
			}
			
		}
	}
}
