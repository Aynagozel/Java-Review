package com.repl_4;

public class DArraySum {
	public static void main(String[] args) {
		int[][]array= {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}	
		};
		//a,1 should print-9
		int column=1;
		int sum=0;
		for(int row=0; row<array.length; row++) {
			sum+=array[row][column];
		}
		System.out.println(sum);
	}
}
