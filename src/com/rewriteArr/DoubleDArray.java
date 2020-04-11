package com.rewriteArr;

public class DoubleDArray {
	public static void main(String[] args) {
		double[][]arr= {
				{2.8, 4.0, 6.6,4.0},
				{8.0,3.0, 12.2,2.0},
				{2.4,6.2,8.0,3.2},
		};
		//prints array
		for(double[]Array:arr) {
			for(double numbers:Array) {
				System.out.print(numbers);
			}
			System.out.println();
		}
		System.out.println("&&&&&&&&&&&&");
		double[][]arr1={
				{2.8, 4.0, 6.6,4.0},
				{8.0,3.0, 12.2,2.0},
				{2.4,6.2,8.0,3.2},
		};
		for(int i=0; i <arr1.length; i++) {
			for(int j=1; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]*2+" ");
			}
			System.out.println();
		}
		
	}
}
