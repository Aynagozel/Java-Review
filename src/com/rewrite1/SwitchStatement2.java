package com.rewrite1;

import java.util.Scanner;

public class SwitchStatement2 {
	public static void main(String[] args) {
		
		String name,answer;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter name of the instractors");
		name=scan.nextLine();
		
		switch(name) {
		case "Shiva":
			answer="Will take care of Java assignment";
			break;
		case "Sandish":
			answer="Will take care of SDLC Assignment";
			break;
		case "Wegas":
			answer="Will take care of Selenium Assignment";
			break;
		case "Asel":
			answer="Will take care of every Assignment";
			break;
		default:
			answer="Invalid instractor selected";
		}
		System.out.println(answer);
		
	}
}
