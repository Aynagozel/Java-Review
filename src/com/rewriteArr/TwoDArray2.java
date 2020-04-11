package com.rewriteArr;

public class TwoDArray2 {
	public static void main(String[] args) {
		System.out.println("-----------------------2D Array---------------------------");
		int[][]numbers= {{2,5},{12,23,45},{4,7,9,0}};
		System.out.println(numbers[1][2]);//45
		System.out.println(numbers[2][numbers.length]);//0
		//1st way:nested for loop:
		
		
		System.out.println("Printing all the elements of array");
		for(int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				System.out.print(numbers[i][j]+" ");
			}
		}
		System.out.println();
		//2d way for each loop:
		
		int[][]number1={ { 2, 5 }, { 12, 23, 45 }, { 4, 7, 9, 0 } };
		for(int[]arr:number1) { // arr[]={2,5,12,23,45,4,7,9,0}// enson=2,5,12,23,45,4,7,9,0
			for(int num:arr) {
				System.out.print(num+" ");
			}
		}
		System.out.println();
		System.out.println("-------------------Printing the max value of the array-------------------");
		
		int maxValue=number1[0][0];
		 for (int i = 0; i < number1.length; i++) {
	            for (int j = 0; j < number1[i].length; j++) {
	            	if(number1[i][j]>maxValue) {
	            		maxValue=number1[i][j];
	            	}
	            	System.out.println("Max number of the array is "+maxValue);

		
		System.out.println();
		System.out.println("-------------to find sum--------------");
	}
}
}
}