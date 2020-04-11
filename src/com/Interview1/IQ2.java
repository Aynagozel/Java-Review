package com.Interview1;

import java.util.Arrays;

public class IQ2 {
	public static void main(String[] args) {
		/*
		 * Write a java program to find the second largest number in the array? Maximum
		 * and minimum number in the array?
		 */
		int[]array= {100, -90, 8787, 898, 0,1,-90, 8787};
		//1 easiest way
		Arrays.sort(array);
		int min=array[0];
		int max=array[array.length-1];
		System.out.println(min);
		System.out.println(max);
		System.out.println("================");
		//2 way
		int[]arr={100, -90, 8787, 898, 0,1,-90, 8787};
		int largest=arr[0];
		int smallest=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println("The smallest value in the array is "+smallest);
		System.out.println("The largest value in the array is "+largest);
		System.out.println("====================");
		//3d way
		int[]nums= {100, -90, 8787, 898, 0,1,-90, 8787};
		int large=nums[0];
		int secondLarge=nums[0];
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>large) {
				secondLarge=large;
				large=nums[i];
			}else if(nums[i]>secondLarge && nums [i]<large) {
				secondLarge=nums[i];
			}
		}
		System.out.println("The 2 largest value in the array is "+secondLarge);
		System.out.println("The largest in the array is "+large);
		
	}
}
