package com.review5;

public class DemoArrays {
	
	public static void main(String[] args) {
		
		int [] a=new int[40];
		for(int i =0; i< a.length; i++) {
			System.out.println(a[i]);
			
			
			
			int [][] b=new int[3][4];
			
			b[1][2]=3;
			b[2][1]=5;
			
		//	System.out.println(b[1][2] );
			
		for(int row =0;row<a.length; row++)	{
			System.out.println("row " +row+ "-->");
			for(int col =0; col< b [row].length; col++){
				int value = b[row][col];
				System.out.print(value + " ");
				
			}
		}
			
			
			
			
			
		}
		
	}
}
