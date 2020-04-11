package com.rewrite3;

public class GetAllValues {
	public static void main(String[] args) {
		String[]animals= {"Cat", " Cow", " Snake", " Dog", " Elephant"};
		// I want to print all values from an array
		//when value is Dog --> I love dogs
		
		for(int i=0; i<animals.length; i++) {
			if(animals[i].equals("Dog")) {
				System.out.println("I love dogs");
			}else {
				System.out.println(animals[i]);
			}
			
		}
		char[]grades={'A', 'B'};
		//System.out.println(grades[0]);
		
		for(int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);
		}
		String[]names={"Fadime", "Konul", "Omer", "Murat", "Manana"};
		for(int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
	}
}
