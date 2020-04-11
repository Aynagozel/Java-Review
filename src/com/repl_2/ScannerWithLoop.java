package com.repl_2;

import java.util.Scanner;

public class ScannerWithLoop {
	public static void main(String[] args) {
		 
	    Scanner scan=new Scanner(System.in);
	    System.out.print("Int: ");
	    int end=scan.nextInt();
	   // end= end*2;
	    
	    for(int i=0; i<end*2; i++){
	      System.out.print(i+" ");
	    }
	    
	        }

	}
