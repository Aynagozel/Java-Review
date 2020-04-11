package com.practice;

public class MethodsWithParemeters {
	void sayHello(){
		System.out.println("Hello Ayna ");
	}
	void sayHelloName(String name) {
		System.out.println("Hello "+name);
	}
	public static void main(String[] args) {
		MethodsWithParemeters m = new MethodsWithParemeters();
		
		m.sayHello();
		m.sayHelloName("Asel");
	}
}
