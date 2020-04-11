package com.rewriteArr;

public class ArrayHighestValue {
	public static void main(String[] args) {
		int[][]arr= {
				 {5,2,3,7},
				    {1,5,1,1},
				    {8,3,1,2},
		};
		int max=arr[0][0];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
			}
		}
		System.out.println(max);
		System.out.println("***********");
		int[][]nums= {
				{5,2,3,7},
			    {1,5,1,1},
			    {8,3,1,2},	
		};
		int largest=nums[0][0];
		for(int i=0; i<nums.length;i++) {
			for(int j=0; j<nums[i].length; j++) {
				if(nums[i][j]>largest) {
					largest=nums[i][j];
				}
				
			}
			
		}
		System.out.println(largest);
	}
}
