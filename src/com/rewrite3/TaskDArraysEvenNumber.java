package com.rewrite3;

public class TaskDArraysEvenNumber {
	public static void main(String[] args) {
		int[][]nums={
				{1,2,3,4,},
				{4,5,6,7},
				{8,9,10,12},
		};
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
	}
}