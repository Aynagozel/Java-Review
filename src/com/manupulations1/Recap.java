package com.manupulations1;

public class Recap {
	public static void main(String[] args) {
		int []arr=new int[4];
		arr[0]=12;
		arr[1]=13;
		arr[2]=14;
		arr[3]=14;
		//System.out.println(arr[1]);
		int num=0;
		for(int i=0; i<4; i++) {
			System.out.println(arr[i]);
			//get sum
			num=num+arr[i];
			System.out.println(arr[i]);
		}
		System.out.println("The sum of arr is "+num);	
		System.out.println("====================");
		
		int[]arr1= {2,5,4,7};
		for(int i:arr1) {
			System.out.println(i);
		}
	}
}
