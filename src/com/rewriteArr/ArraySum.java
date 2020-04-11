package com.rewriteArr;

public class ArraySum {
	//write a program to print sum of the elements in third row
	public static void main(String[] args) {
		
	
	int [][]arr= {
			{5,2,3,7},
			{1,5,2,2},
			{1,2,3,4},	
	};
	int row=2;
	int sum=0;
	for(int j=0; j<arr[row].length; j++) {
		sum=sum+arr[row][j];
		
	}
	System.out.println(sum);
	System.out.println("********");
	
	int[][]arr1= {
			{5,2,3,7},
			{1,5,2,2},
			{1,2,3,4},		
	};
	int row1=2;
	int total=0;
	for(int j=0; j<arr1[row].length; j++) {
		total=total+arr[row][j];
	}
	System.out.println(total);
	
	}
}
