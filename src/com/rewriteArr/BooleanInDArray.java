package com.rewriteArr;

public class BooleanInDArray {
	public static void main(String[] args) {
		
		int[][]arr={{1,1,1},{1,1,1},{1,1,1}};
		//true
		boolean flag=false;
		for(int i=0; i<arr.length; i++) {
			if(arr.length==arr[i].length) {
				flag=true;
			}
			break;
		}
		System.out.println(flag);
		System.out.println("^^^^^^^^^^^^^^");
		int[][]arr1= {{1,1,1},{1,1,1},{1,1,1}};
		
		boolean row=false;
		for(int i=0; i<arr1.length; i++) {
			if(arr.length==arr[i].length) {
				row=true;
			}
		}
		System.out.println(row);
		int[][]arr2= {{1,1,1},{1,1,1},{1,1,1}};	
		boolean col=false;
		for(int i=0; i<arr2.length; i++) {
			if(arr.length==arr[i].length) {
				col=true;
			}
		}
		System.out.println(col);
		}
	}

