package com.repl_3;

public class Arrays {
	public static void main(String[] args) {
		/*int[]array= {45,78,12,67,55};
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}*/
		
		int[]array1= {45,78,12,67,55,89,23,77,88};
		for(int i=0; i<array1.length; i+=2) {
			System.out.print(array1[i]+" ");
		}
		
		System.out.println("_____________");
		char[] arr = {'s', 'a', 'y',  'b', 'n', 'c', 't',  'd', 'a', 'e', 'x'};
		for(int i=0; i<arr.length; i+=2) {
			System.out.print(arr[i]);
		}
		System.out.println("============");
		String[]names= {"This", "is", "array", "of", "strings"};
		for(String array: names) {
			System.out.print(array+" ");
		}
		System.out.println("=====");
		String[]names1= {"This", "is", "array", "of", "strings"};
		for(int i=0; i<names1.length-1; i++) {
			System.out.print(names1[i]+" ");
		}
		
	}
}
