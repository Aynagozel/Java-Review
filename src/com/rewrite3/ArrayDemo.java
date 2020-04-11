package com.rewrite3;

public class ArrayDemo {
	public static void main(String[] args) {
		int[]nums=new int[4];
		nums[0]=12;
		nums[1]=13;
		nums[0]=14;
		nums[3]=15;
		//to find # of elements we use .length
		System.out.println(nums.length);
		System.out.println(nums[0]);
						//0			1			2				3
		String[]array= {"Winter", " Fall", " Summer", " Spring"};
		// I was born in Summer
		System.out.println("I was born in "+array[2]);
		
		//array.length will return an integer
		
		
		int[]score= {80,90, 70, 100, 99};
		int arraySize=array.length;
		System.out.println(arraySize);
		
		String[]names= {"Fadime", " konul", " Manana"};
		System.out.println(names.length);
		
		String[]Saturday=new String[1];
		Saturday[0]="Java";
		System.out.println("Saturday is "+Saturday[0]+" coding Day ");
		
		String[]names1=new String[5];
		names1[0]="Fadime";
		names1[1]="Fatma";
		names1[2]="Seval";
		names1[3]="Nuray";
		names1[4]="Sasha";
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]+" ");
		}
		String[]names2= {"Fadime", "Konul"};
		for(String name:names2) {
			System.out.println(name);
		}
		
}
}
