package com.rewrite3;

public class D2Array {
	public static void main(String[] args) {
		int[]numbers= {5,5,5,5,5,5};
		int sum=0;
		for(int i=0; i<numbers.length; i++) {
			sum=sum+numbers[i];
		}
		System.out.println(sum);
		System.out.println("__________________");
		//how to find largest number in array
		int[]nums= {10,20,0,30,-140,-70};
		int largest=nums[0];
		for(int i=0; i<nums.length; i++) {
			if(nums[i]>largest) {
				largest=nums[i];
			}
		}
		System.out.println("The largest number from an array is "+ largest);
		System.out.println("____________");
		int[][]numbers1= {{9,8,7},
						 {4,5,5},
						 {4,5,6},
		};		
		System.out.println(numbers1[0][2]);
		System.out.println("_________________");
		int[][]numbers2= {
				{12,13,34,56,67,78,},
				{56,47,89,34,34, 77},
				{67,78,78,78,78,78,},
		};
		for(int row=0; row<numbers2.length; row++) {
			for(int col=0; col<numbers2[row].length; col++) {
				System.out.print(numbers2[row][col]+" ");
			}
			
		}
	}
}
