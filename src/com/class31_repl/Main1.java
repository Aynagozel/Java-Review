package com.class31_repl;

public class Main1 implements ParentInterface {
	  public void parentMethod(){
	    	System.out.println("Parent Method-----welcome to syntax solutions");
	    }
	    public void childMethod(){
	      System.out.println("Child Method-----hi syntax solutions how are you");
	    }
	  
	  public static void main(String[] args) {
	    
	    Main1 mm= new Main1();
	    mm.parentMethod();
	    mm.childMethod();
	  }
	}

