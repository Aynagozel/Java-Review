package com.rewrite1;

import java.util.Scanner;

public class TaskSale {
	public static void main(String[] args) {
		/*
		 * ask user enter boolen value for sale if no sale --> 
		 * I am not shopping if sale --> check check the price of item
		 *  based on the amound we will calculate the price after discount if price less than < 20
		 *   --> apply 10% if between 20-100 -- 20% if between 100-500-->30% anything --> 50 %
		 *   After discount ____ the price of the item reduce from ___ to ____
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Is there a sale going on? True or False");
		boolean sale=scan.nextBoolean();
		
		double price;
		double discount;
		double finalPrice;
		
		if(!sale) {
			System.out.println("I am not shopping");
		}else {
			System.out.println("What is the actual price");
			price=scan.nextDouble();
			if(price<20) {
				discount=price * 0.10;
			}else if(price>=20 && price<100) {
				discount=price *0.20;
			}else if(price>=100 && price<500) {
				discount=price *0.30;
			}else {
				discount=price *0.50;
			}
			finalPrice=price-discount;
			System.out.println("After discount "+discount+ " the price of the item reduce from "+price+" to "+finalPrice);
		}
	}
}
