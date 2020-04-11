package com.review7;

public class World {
	String firstName;
	String lastName;
	char gender;
	String hairColor;
	int weight;
public static void main(String[] args) {
		
		Baby baby1 = new Baby();
		baby1.cry();
		baby1.firstName="John";
		baby1.lastName="Due";
		baby1.gender='M';
		baby1.hairColor="Yellow";
		baby1.weight= 7;
		
		//baby1.cry();
		baby1.talk();
		baby1.walk(3);

		System.out.println(baby1.firstName);
		System.out.println(baby1.gender);
		baby1.cry();
		baby1.walk(3);
		
		//Baby baby2 = new Baby();
		
		//baby2.cry();
		//baby2.firstName= "Ann";
		System.out.println(" Fullname of the baby: ");
		
}
}