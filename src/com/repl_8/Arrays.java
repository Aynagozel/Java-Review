package com.repl_8;

public class Arrays {
	public static void main(String[] args) {
		
	 int[]nums={2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020};
	 for(int i=0; i<nums.length; i++) {
		 System.out.println(nums[i]);
	 }
	 //2 nd style
	System.out.println("^^^^^^^^^^^^^^^^^^^^^"); 
	 int [] years =new int[11];
	 for(int i=0; i<=years.length-1; i++) {
		 years[i]=2010+i;
	 }
	 for(int i=0; i<years.length; i++) {
		 System.out.println(years[i]);
	 }
}
}