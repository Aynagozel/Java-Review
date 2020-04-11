package com.rewrite3;

public class AnArrayTask {
	public static void main(String[] args) {
		String[]cars= {"Toyota", " juguli"};
		for(String name:cars) {
			System.out.println(name);
		}
		String[]cars1= {"Toyota", " juguli"};
		for(int i=0; i<cars1.length; i++) {
			System.out.println(cars1[i]);
		}
		String[]names=new String[3];
		names[0]="Toyota";
		names[1]="Jiguli";
		names[2]="Camry";
		
		for(int i=0; i<names.length; i++)
		System.out.println(names[i]);
		
		int[]array=new int[4];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		array[3]=4;
		//for(int i=0; i<array.length; i++)
		System.out.println("Sum of the all elements are "+array.length);
		
		int[]array1= {1,2,3,4};
		for(int i=0; i<array1.length; i++) {
			System.out.println(array1[i]);
		}
		int[]array2= {1,2,3,4,5};
		for(int name: array2) {
			System.out.println(name);
		}
	}
}
