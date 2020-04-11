package com.review5;

public class Pyramid {
	
	public static void main(String[] args) {
		 
		for(int row=1; row<=5; row++) {
			//System.out.println(row);
			for(int col =1; col <=row; col++) {
				System.out.print(col+ " ");
				//System.out.print(2* col -1);
				//System.out.print(col* col+ " ");
			}
			System.out.println();
		}
	}
}
