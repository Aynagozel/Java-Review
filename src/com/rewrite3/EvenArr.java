package com.rewrite3;

public class EvenArr {
	public static void main(String[] args) {
		
		int[][]nums={
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}	
		};
		int sum=0;
		for(int numbers[]:nums) {
			for(int getNum:numbers) {
				if(getNum%2==0) {
					System.out.println(getNum+" Is Even Number");
				}
				//sum=sum+getNum;
			}
			
		}
		//System.out.println("The sum of all elements in the array is = "+sum);
		int[][]arr= {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}	
		};
		int total=0;
		for(int numbers[]:arr) {
		for(int get:numbers) {
			if(get%2==0) {
				//.out.println(get+"Is even");
			}
			total=total+get;
		}	
	}
		System.out.println("The total of all elements"+total);
}
}