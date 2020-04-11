package com.rewrite;

import java.util.Scanner;

public class MoreLogicalExamples {
	public static void main(String[] args) {
		/*ask user to enter daily sales
		 * based on the sales range we want to give commission to the person
		 * if sales is <100 --> commission is 10%
		 * if sales if between 100 -200 --> commision of 20%
		 * etc...
		 */
		
		Scanner scan;
		double salesAmount;
		double commission;
		
		scan= new Scanner(System.in);
		System.out.println(" please enter your sales amount");
		salesAmount=scan.nextDouble();
		
		if(salesAmount>=1 && salesAmount<100) {
			//lets give user 10% commision of a sale
			commission=salesAmount*0.1;
		}else if(salesAmount>=100 && salesAmount <200) {
			//lets give user 20% commision of a sale
			commission=salesAmount*0.2;
		}else if(salesAmount>=200 && salesAmount<500) {
			// lets give user 30% commision of a sale
			commission=salesAmount*0.3;
		}else if(salesAmount>=500) {
			//lets give user 50% commision of a sale
			commission=salesAmount*0.5;
		}else {
			commission=0;
		}
		System.out.println("Based on the sales your commision is "+commission);
	}
}
