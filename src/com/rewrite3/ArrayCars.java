package com.rewrite3;

public class ArrayCars {
	public static void main(String[] args) {
		String[]cars= {"Toyota", "Camry", "Bemba"};
		for(int i=0; i<cars.length; i++) {
			switch(cars[i]) {
			case"Toyota":
				System.out.println("German car");
				break;
			case"Camry":
				System.out.println("Pl car");
				break;
			case"Bemba":
				System.out.println("lk car");
				break;
			default:
			}
			System.out.println(cars);
		}
	}

}
