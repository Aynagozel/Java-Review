package com.rewriteArr;

public class SumColumnDArray {
	public static void main(String[] args) {
		int [][]arr= {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
		};
		// a, 1 should print -9
		int column=1;
		int sum=0;
		for(int row=0; row<arr.length; row++) {
			sum+=arr[row][column];
		}
		System.out.println(sum);
		System.out.println("^^^^^^^^^^^^^^");
		int[][]nums= {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}	
		};
		int col=1;
		int total=0;
		for(int row=0; row<nums.length; row++) {
		total+=nums[row][col];
	}
		System.out.println(total);
}
}