package com.rewriteArr;

public class ArraysLargestNum {
	public static void main(String[] args) {
		int[][]arr= {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
		};
		//shoul be print 8
		int max= arr[0][0];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; i++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		System.out.println(max);
		System.out.println("*********");
		int[][]nums= {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}	
		};
		int large=nums[0][0];
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				if(nums[i][j]>large) {}
				large=nums[i][j];
			}
		}
		System.out.println(large);
	}
}
