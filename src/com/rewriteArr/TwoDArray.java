package com.rewriteArr;

public class TwoDArray {
	public static void main(String[] args) {
		//int[][] numbers = new int[2][3];// rows index: 0 and 1 , columns index:0 1 and 2
        /*
         * numbers[0][3]=5; numbers[1][3]=7; numbers[2][1]=8;
         * //System.out.println(numbers[0][3]); //System.out.println(numbers[1][3]);
         * //System.out.println(numbers[2][1]);
         */
		int[][]nums= {{2,5},{12,23,45},{4,7,9,0}};
		//first way to get value with standart for loop:
		   for (int i = 0; i < nums.length; i++) {
	            for (int j = 0; j < nums[i].length; j++) {
	                System.out.print(nums[i][j] + " ");
	            }
	            // System.out.println(number[i]);
	            
		   }
		   //System.out.println();
		   System.out.println("------------------------------------------");
		   // second way to get value from an array with enhanced/ advanced/ for loop:
		   for(int[]num:nums) {
			   for(int numb:num) {
				   System.out.print(numb+" ");
			   }
		   }
	}
}
