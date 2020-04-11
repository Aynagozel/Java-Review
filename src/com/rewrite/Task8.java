package com.rewrite;

public class Task8 {
	public static void main(String[] args) {
		
		 double rate=4.5;
		 double price=200000;
		 
		 if(rate>=4.5) {
			 System.out.println("I will not buy a house");
		 }else {
			 System.out.println("I will consider to buy the house");
			 if(price>200000) {
				 System.out.println("I will need to take a loan ");
			 }else {
				 System.out.println("I will pay with cash");
			 }
		 }
	}
}
