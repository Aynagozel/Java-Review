package com.rewrite;

public class task6 {
	public static void main(String[] args) {
		
		double rate=5.5;
		double price=20000;
		
		if(rate>=4.5) {
			System.out.println("I am not buying a house");
		}else {
			System.out.println("I will consider buying the house");
			
			if(price>200000) {
				System.out.println("I will need a loan to buy the house");
			}else {
				System.out.println("I will pay cash for my house");
			}
		}
	}
}
