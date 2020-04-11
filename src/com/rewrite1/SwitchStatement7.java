package com.rewrite1;

import java.util.Scanner;

public class SwitchStatement7 {
	public static void main(String[] args) {
		String make, carOrigin;
		Scanner inp=new Scanner(System.in);
		System.out.println("Please enter your favorite car make");
		make=inp.nextLine();
		
		switch(make) {
		case "BMW":
			carOrigin="german car";
			break;
		case "Tayota":
			carOrigin="japanise car";
			break;
		case "Maserati":
			carOrigin="italian car";
			break;
		default:
			carOrigin="unknown";
		}
		System.out.println("Your favorite car is "+carOrigin);
	}
}
