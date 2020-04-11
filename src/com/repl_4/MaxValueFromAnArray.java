package com.repl_4;

public class MaxValueFromAnArray {
	public static void main(String[] args) {
		
	
	int[][] numbers = {
			{5,2,3,7},
			{1,5,1,1},
			{8,3,1,2}
		};
	int maxValue=numbers[0][0];
	 for(int i=0; i<numbers.length; i++) {
		 for(int j=0; j<numbers[i].length; j++) {
			 if(numbers[i][j]>maxValue) {
				 maxValue=numbers[i][j];
			 }
			 //System.out.println(maxValue);
		 }
		 //System.out.println(maxValue);
	 }
	System.out.println(maxValue);
	
	
	}
}