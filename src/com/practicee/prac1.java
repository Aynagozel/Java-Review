package com.practicee;

public class prac1 {
	
	public static void main(String[] args) {
		
		int array_variable[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int sum = 0;

		for (int i = 0; i < 3; ++i) {

		   for (int j = 0; j < 3; ++j) {

		       sum = sum + array_variable[i][j];

		   }

		}

		System.out.print(sum / 5);
	

	int[] array1 = { 1, 4, 3, 6, 8, 2, 5 };

	int what = array1[0];

	for (int index = 0; index < array1.length; index++) {

	       if (array1[index] > what) {

	                  what = array1[index];

	        }

	}

	System.out.println(what);

	}
}
