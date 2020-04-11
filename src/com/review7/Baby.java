package com.review7;

public class Baby {
	String firstName;
	String lastName;
	char gender;
	String hairColor;
	int weight;
	
	void talk() {
		System.out.println("Baby speaks like bla bla bla");
	}
	void walk(int times) {
		for(int i = 0; i < times; i ++)
		System.out.println("Baby crawl");
	}
	void cry() {
		System.out.println("Baby cry every minutes");
	}
	//void displayBabyInfo() {
		//System.out.println("Fullname is: "+firstName+ " "+ lastName);
	//if (gender == 'M') {
		//System.out.println("Boy");
//	}
	
	//}
	
	public static void main(String[] args) {
		
		Baby baby1 = new Baby();
		baby1.firstName="John";
		baby1.lastName="Due";
		baby1.gender='M';
		baby1.hairColor="Yellow";
		baby1.weight= 7;
		
		baby1.talk();
		baby1.walk(3);
		baby1.cry();
		System.out.println(" Fullname of the baby: ");
	
}
}
