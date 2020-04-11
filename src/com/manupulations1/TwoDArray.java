package com.manupulations1;

public class TwoDArray {
	public static void main(String[] args) {
		int[][]arr=new int[2][3];
		//First Row
		arr[0][0]=9;
		arr[0][1]=10;
		arr[0][2]=11;
		//Second Row
		arr[1][0]=9;
		arr[1][1]=10;
		arr[1][2]=11;
		for(int i[]: arr) {
			for(int j:i) {
				System.out.println(j);
			}
		}
		System.out.println("================");
		int[][]arr2= {
				{44,55,67},
				{11,22,33}
		};
		for(int[]is:arr) {
			for(int is2: is) {
				System.out.println(is2);
			}
		}
	}
}
