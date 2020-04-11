package com.class32_repl;

 class Main4 {
public static void main(String[] args) {
		Person person = new Person("John", "Doe", 10, 25, 1900, "123-45-6789");
		
		System.out.println(person.getFirstname());
		System.out.println(person.getLastname());
		System.out.println(person.formatBirthday());
		System.out.println(person.getSsn());
	}
}
 //Create the a Person class with the following:
	 //Class Variables
	// String firstname
	// String lastname
	// int birthmonth
	// int birthday
	// int birthyear
	// String ssn
	// All variables above should be private.

	 //Constructor
	 //The main constructor should take in all values and assign them to their respective private class variables

	// Methods
	 //Create a public getters and setters for all the variables. 

	// Create a public method called formatBirthday, which will return a String composed of their birthday in mm/dd/yyyy format.  For example, if birthmonth=3, birthday=22, birthyear=2000, it should return the String "3/22/2000"

	 //in Main Class. 

	// Instantiate and object of Person and provide values. follows below outputs for values. 

	 //using getter and method print them separately. 
// Note: Read carefully the steps. 


