package com.rewrite3;

public class IntroArrays2 {
	public static void main(String[] args) {
		
		int[] nums =new int[3];
		nums[0]=1;
		nums[1]=2;
		nums[2]=3;
		// how can changer 1 to 100
		nums[0]=100;
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[2]);//100+3
		// the size of an array is fixed
		
		String[]names=new String[3];
		names[1]="Seda";
		names[2]="Jamie";
		//names[3]="Olga";// during run time we will get an exception
		//ArrayIndexOutOfBoundsException
		
		System.out.println(names[0]);
		
		// we are putting less elements inside
		//--> compiler will give default values
		double[]numbers=new double[4];
		numbers[1]=100;
		numbers[3]=200;
		System.out.println(numbers[2]);
		
	}
}
