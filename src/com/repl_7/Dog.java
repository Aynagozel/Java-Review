package com.repl_7;

public class Dog {
	String breed, name, color;
	void bark() {
		System.out.println(name+" can bark");
	}
	void run() {
		System.out.println(name+" can run");
	}
	void play() {
		System.out.println(name+"can play");
	}
	public static void main(String[] args) {
		 Dog dog1=new Dog();
		 dog1.breed="German";
		 dog1.name="Husky";
		 dog1.color="Brown";
		 
		 dog1.bark();
		 dog1.run();
		 dog1.play();
		 
		 Dog dog2=new Dog();
		 dog2.breed="American";
		 dog2.name="Gonurja";
		 dog2.color="White";
		 
		 dog2.bark();
		 dog2.run();
		 dog2.play();
		 
		 Dog dog3=new Dog();
		 dog3.breed="German";
		 dog3.name="Alabay";
		 dog3.color="Yellow";
		 
		 dog3.bark();
		 dog3.run();
		 dog3.play();
	}
}
