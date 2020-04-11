package com.rewriteArr;

public class EvenIndexArray {
	public static void main(String[] args) {
		int[][]arr= {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}	
		};
		//should print 3
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(i%2==0||j%2==0) {
					sum=sum+arr[i][j];
				}
			}
		}
		System.out.println(sum);
		System.out.println("**********");
		int[][]nums= {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}	
		};
		int total=0;
		for(int i=0;i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				if(i%2==0 || j%2==0) {
					total=total+nums[i][j];
				}
			}
			System.out.println(total);
		}
	}
}
