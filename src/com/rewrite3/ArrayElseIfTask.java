package com.rewrite3;

public class ArrayElseIfTask {
	public static void main(String[] args) {
		String[]countries= {"Turkmenistan", " Turkey", " Russia", " USA"};
		for(int i=0; i<countries.length; i++) {
			if(countries[i].equals("Turkmenistan")) {
				System.out.println("Ashgabat");
			}else if(countries[i].equals("Turkiye")) {
				System.out.println("Ankara");
			}else if(countries[i].equals("Russia")) {
				System.out.println("Moscow");
			}else if(countries[i].equals("USA")) {
				System.out.println("Washington DC");
			}
			System.out.println(countries[i]);
		}
	}
}
