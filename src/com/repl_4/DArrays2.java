package com.repl_4;

public class DArrays2 {
	public static void main(String[] args) {
		double[][]arr= {
				{1.0,2.1,3.2, 2.2},
				{5.4,6.5,7.6,1.7},
				{8.9,9.8,10.9,6.7,4.9},
		};
		for(double[]Array:arr) {
			for(double numbers:Array) {
				System.out.print(numbers);
			}
			System.out.println();
		}
System.out.println("++++++++++++++++++++++++++");
		double[][] a = {
			{1.4,2.0,3.3,2},
			{4,1.5,6.1,1},
			{1.2,3.1,4,1.6}
		};
		//prints array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] * 2+" ");
			}
			System.out.println();
		}
	}

}
	
