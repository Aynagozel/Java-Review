package com.review5;

public class TwoD_ArrayDemoW {
	
	public static void main(String[] args) {
		for(int row=1; row<=4; row++) {
			System.out.print("Floor "+row+ " -> " );
			for(int col=1; col<=6; col++) {
				//System.out.println(floor + "." + room + " ");
				//System.out.print(col + " ");
				System.out.print(row + "." + col + " ");
			}
			System.out.println();
		}
	}
}
