package com.review5;

import java.util.Scanner;

public class Scanner_2D_Array {
	
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Body, how many rows do you want?");
	int rows =scan.nextInt();
	
	System.out.println("Body, how many cols do you want?");
	int cols=scan.nextInt();
	
	
	String [][]names=new String[rows][cols];
	//names.length=row
	//names.length=cols
	for(int i=0; i<rows; i++) {
		for(int j =0; j<cols; j++) {
			System.out.println("Body, enter a name!");
			names[i][j]=scan.next();
		}
	}

	System.out.println("Lets print the names!");
	
	for(int i =0; i<rows; i++) {
		for(int j=0;j<cols; j++) {
			System.out.print(names[i][j] + " ");
		}
		System.out.println();
	}
	
	
}
}