package com.rewrite3;

public class AllValuesFromArray {
	public static void main(String[] args) {
		// 0 1 2 3 4 5
		char[]grades= {'A', 'B', 'C', 'D', 'E', 'F'};
		
		int a=2;
		System.out.println(grades[4]);
		System.out.println(grades[a]);
		a--;//3
		System.out.println(grades[a]);
		System.out.println("-----------------");
		System.out.println();
		a+=2;//2+2
		System.out.println(grades[a]);
		a--;//3
		System.out.println("---------------");
		System.out.println(grades[0]);
		System.out.println(grades[1]);
		System.out.println(grades[2]);
		System.out.println(grades[3]);
		System.out.println(grades[4]);
		
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
		}
		System.out.println("---------------------");
		String[]animals= {"Cat", "Dog", "Cow", " Snake", "Elephant"};
		int size=animals.length;
		//System.out.println(size);
		
		for(int i=0; i<size; i++) {
			System.out.println(animals[i]+" ");
		}
		// create an array to store 5 double values, print all elements in 1 line
	
	}
}
