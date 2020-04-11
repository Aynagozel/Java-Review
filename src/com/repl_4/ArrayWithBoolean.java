package com.repl_4;

public class ArrayWithBoolean {
	public static void main(String[] args) {
		int[][]arr= {{1,1,1},{1,1,1},{1,1,1}};
		//true
		boolean flag=false;
		
		for(int i=0; i<arr.length; i++) {
			if(arr.length==arr[i].length) {
				flag=true;
			}
			break;
		}
		System.out.println(flag);
	}
}