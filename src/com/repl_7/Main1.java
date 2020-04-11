package com.repl_7;

public class Main1 {
	String color, model, name;
	int year;
	public static void main(String[] args) {
		Main1 car1=new Main1();
		car1.color="Black";
		car1.year=2019;
		car1.model="BMW";
		
		Main1 car2=new Main1();
		car2.color="White";
		car2.year=2018;
		car2.name="Toyota";
		
		System.out.println("Car color is "+car1.color+" and car model year is "+car1.year);
		System.out.println("Car color is "+ car2.color+ "and car model is "+car2.year);
		
	}
	public void newLine1() {
		// TODO Auto-generated method stub
		
	}
}
