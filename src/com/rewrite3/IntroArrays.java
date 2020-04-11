package com.rewrite3;

public class IntroArrays {
	public static void main(String[] args) {
		
		int a;
		a=10;
		
		int a1=10;
		//1 way
		
		int[]b;//declare an array --> prefered way
		int c[];
		b=new int [4];// initilize an array
		
		//2 way --> all in 1 line (declaration & initialization)
		int[]array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		//acces value from an array
		System.out.println(array[2]);
		
		// lets create an array that will store classes
		String[]classes=new String[4];
		classes[0]="Java";
		classes[1]="SDLC";
		classes[2]="Manual Testing";
		classes[3]="Git";
		//Today we have Java class
		System.out.println("Today we have "+classes[0]+" class");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		
		
	}
}
