package com.rewriteArr;

public class SumOfEachDArray {
	public static void main(String[] args) {
		int[][]nums= {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
		};
		int sums[]=new int[nums.length];
		for(int i=0; i<nums.length; i++) {
			int row=0;
			for(int j=0; j<nums[i].length; j++) {
				row+=nums[i][j];
			}
			sums[i]=row;
		}
		for(int sum:sums) {
			System.out.println(sum);
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^");
		int[][]num= {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
		};
		int sum[]=new int [num.length];
		for(int i=0; i<num.length; i++) {
			int row=0;
			for(int j=0; j<num[i].length; j++) {
				row+=num[i][j];
			}
			sum[i]=row;
		}
		for(int sums1:sum) {
			System.out.println(sums1);
		}
		
	}
}
