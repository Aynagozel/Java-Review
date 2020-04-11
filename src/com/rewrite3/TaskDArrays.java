package com.rewrite3;

public class TaskDArrays {
	public static void main(String[] args) {
		int[][]nums= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
		};
		int sum=0;
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				//System.out.print(nums[i][j]+" ");
				sum=sum+nums[i][j];
			}
			System.out.println();
		}
		System.out.println("The sums of all elements in array is = "+sum);
		
		int[][]nums1= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
		};
		
		int sum1=0;
		for(int i=0; i<nums1.length; i++) {
			for(int j=0; j<nums1[i].length; j++) {
				if(i%2==0) {
					System.out.println(i+" is Even Number");
				}
				sum1=sum1+j;
			}
		}
		System.out.println("The sum of all elements in the array is "+sum1);
	}
}
