package com.review5;

public class Arrays {
	
	public static void main(String[] args) {
		int[]a=new int[5];
		a[2]=7;
		a[4]=9;
		a[0]=4;
		a[1]=5;
		a[3]=2;
		
		int sumOfArray=0;
		for (int i=0;i <a.length; i++) {
			sumOfArray=sumOfArray + a[i];
		}
		System.out.println(sumOfArray);
		
		int[] b= {4,5,7,2,9};
		int sumB=0;
		for(int i=0; i<b.length; i++) {
			sumB+= b[i];
		}
		System.out.println(sumB);
		
		

	String[]s= {"ayna", "Atas","arslan", " Annamuhammet", "sona", "Kakamjan", " ejemjan"};
	for(int i=0; i < s.length; i++) {
		System.out.println(s[i]);
	}
}
}