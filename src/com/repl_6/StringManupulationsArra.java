package com.repl_6;

import java.util.Scanner;

public class StringManupulationsArra {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String[]arr=new String[5];
		for(int i=0; i<5; i++) {
			arr[i]=scan.nextLine();
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i].length()>=3) {
				System.out.println(arr[i].charAt(0)+""+arr[i].charAt(1)+""+arr[i].charAt(2));
			}
		}
	}
}
