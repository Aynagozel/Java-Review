package com.Interviewq;

public class Questions2 {
	public static void main(String[] args) {
		
		String x="Hello world";
		
		String y="Hola";
		System.out.println("Before swap:" + x + "" +y);
		
		x=x+y;
		y=x.substring(0,x.length()-y.length());
		x=x.substring(y.length());
		
		System.out.println(" After swaping:" + x + "" +y);
		
	}
}
