package com.rewriteArr;

import java.lang.reflect.Array;

public class TwoDArraySum {
	public static void main(String[] args) {
		System.out.println("---------------- to find sum-----------------");
		int[][]number1={ { 2, 5 }, { 12, 23, 45 }, { 4, 7, 9, 0 } };

		int sum=0;
		for(int i=0; i<number1.length; i++) {
			for( int j=0; j<number1[i].length; j++){
				sum+=number1[i][j]; //sum=sum+number[i][j];
			}
		}
		System.out.println("Total of the array "+sum );
		
		System.out.println("-----------Single Array---------------");
		int[]arr= {10,20,30,40,50};
		System.out.println("---------------to find even index of the arary--------------------");
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				System.out.println("Even index of the array "+arr[i]);//OR for(int i=0; i<arr.length; i+=2);
			}
		}
	}
}
