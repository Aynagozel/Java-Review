package com.rewrite;

public class Program1 {
	 /*
	  * declare 2 variable and initilize them
	  * display result of addition, substruction, multiplication and devision
	  */
		public static void main(String[] args) {
			
			int num1, num2;
			num1=20;
			num2=10;
			
			System.out.println(num1+num2); //30
			System.out.println(num1-num2); //10
			System.out.println(num1*num2); //200
			System.out.println(num1/num2); //2
			
			// how can we print value of num1 and num2 together
			System.out.println(num1+" "+num2);
			
			int sum=num1+num2;
			int sub=num1-num2;
			int mult=num1*num2;
			int div=num1/num2;
			
			// the addition/substruction...of 2 numbers is_
			System.out.println(sum);
			System.out.println(sub);
			System.out.println(mult);
			System.out.println(div);
			
			int a=10;
			int b=22;
			
			String x="Hello";
			String y="Bye";
			
			System.out.println(a+b+x+y);
			System.out.println(a+x+b+y);
			System.out.println(x+y+a+b); // HelloBye1022
			
			
			
			
			
		
	}
}
