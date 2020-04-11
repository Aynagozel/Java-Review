package com.review5;

public class Max2DArray {
	
	public static void main(String[] args) {
		
	int[][]b= {
			{2,3,5},
			{2,4,7},
			{8,1,9},
			{3,5,1},
		};
	
	int max=b[0][0];
	
	for(int i=0; i<b.length; i++) {
		for(int j=0;j< b[i].length; j++) {
			if (b[i][j]>max) {
				max =b[i][j];
				
			}
		}
	}
	System.out.println("maximum is "+ max);//maximum is 19
	}
	
	//int[][]b= {
	//{2,3,5},
			//{2,4,7},
		//	{8,1,9},
			//{3,5,1},
//	};

	//int max=b[0][0];
	//int sum=0;
	
	//for(int i=0; i<b.length; i++) {
		//for(int j=0;j< b[i].length; j++) {
		//	sum += b[i][j];
		//	if (b[i][j]>max) {
		//		max =b[i][j];
				
		//	}
		//}
	//}
	
		
		//System.out.println("maximum is "+ max);max is 10
	
	//System.out.println("sum is "+ sum);sum is 50
	}
	
	
	
//}
