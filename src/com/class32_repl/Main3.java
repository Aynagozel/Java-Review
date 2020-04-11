package com.class32_repl;

public class Main3 {
	public static void main(String[] args) {
	    
	    //creating instance of Account class  
	    Account acc=new Account();  
	    //setting values through setter methods  
	    acc.setAcc_no(7560504000l);  
	    acc.setName("Sumair");  
	    acc.setEmail("sumair@syntaxsolutions.com");  
	    acc.setAmount(50000);  
	    //getting values through getter methods  
	    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  

	    
	  }
	}

