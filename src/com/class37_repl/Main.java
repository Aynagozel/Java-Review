package com.class37_repl;


	import java.util.Scanner;

	public class Main {
	  public static void main(String[] args) {
	     int a=10, b=0, result;
	    
	 
	  // try block
	 
	  try {
	    result  = a / b;
	    System.out.println("Result = " + result);
	  }
	 
	  // catch block
	 
	  catch (ArithmeticException e) {
	    System.out.println(e.getMessage());
	  }
	  }
	}
	  

