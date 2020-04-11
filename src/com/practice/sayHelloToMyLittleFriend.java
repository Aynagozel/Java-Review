package com.practice;

public class sayHelloToMyLittleFriend {
void sayHelloToMyLittleFriend(String country) {
	switch(country){
		case "USA":
		System.out.println("Hello");
		break;
		case "Turkey":
		System.out.println("Merhaba");
		break;
		case "Turkmenistan":
		System.out.println("Salam");
		break;
		default:
		System.out.println("Unknown country");
	}
}
	public static void main(String[] args) {
		MethodsWithParemeters m = new MethodsWithParemeters();
		
		m.sayHello();
		m.sayHelloName("Asel");
	}
	
}

