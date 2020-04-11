package com.repl_6;

import java.util.Scanner;


public class Manipulations {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String[]arr=new String[5];
		for(int i=0; i<5; i++) {
			arr[i]=scan.nextLine();
		}
		for(int i=0; i<arr.length;i++) {
			char ch1=arr[i].charAt(0);
			char ch2=arr[i].charAt(1);
			char ch3=arr[i].charAt(2);
			
			System.out.println(ch1+""+ch2+""+ch3);
		}
		
	}
}
