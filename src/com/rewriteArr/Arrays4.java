package com.rewriteArr;

public class Arrays4 {
	public static void main(String[] args) {
		int[]arr= {2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020};
		int size=arr.length;
		for(int i=0; i<size; i++) {
			
			System.out.println(arr[i]);
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^");
		//2d way
		int[]years=new int[11];
		for(int i=0; i<=years.length-1; i++) {
			years[i]=2010+i;
		}
		for(int i=0; i<years.length; i++) {
			System.out.println(years[i]);
		}
	}
}
