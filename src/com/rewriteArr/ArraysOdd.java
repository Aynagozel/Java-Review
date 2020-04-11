package com.rewriteArr;

public class ArraysOdd {
	public static void main(String[] args) {
		int[][]nums= {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
		};
		//should print 3
		int count=0;
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				if(nums[i][j]<0 && nums[i][j]%2!=0) {
				count=count+i;
			}
		}
		}
		System.out.println(count);
		System.out.println("^^^^^^^^^^^^^^^");
		
		int[][]num= {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
		};
		int coun=0;
		for(int i=0; i<num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				if(num[i][j]<0 && num[i][j]%2!=0) {
					count=count+i;
				}
			}
		}
	
	System.out.println(count);
	
}
}
