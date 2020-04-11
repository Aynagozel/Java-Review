package com.review7;



public class MathOperations {
	//parameters can be diffrent types
	//int add(int number1,int number2, int number3 ) {

		//int sum = number1 + number2 + number3;
	//	System.out.println(" The sum is " +sum);//both of them true result
		//System.out.println("The sum of "+ number1+ " + " +number2+ " + " +number3+ " is "+sum);
		//return sum;// I have to return number
	//}
	void substract(int number1, int number2) {
		int result= number1 - number2;
		//System.out.println(" Substract result is "+result);
		System.out.println(number1 + " - " + number2 + " is "+result);
	}
	void multiply(double num1, double num2) {
		double result = num1 * num2;
	//	int resultInt =(int)result;
	//	return resultInt;
		System.out.println("The multipilication of "+ num1+ " and "+ num2+ " is "+result);
	
	}
	void devide(double num1, double num2) { //double add first if get the result
		if (num2==0) {
			//We connot divide by zero
			System.out.println("");
		}else {
		double result =num1/num2;
		System.out.println("The devision of " + num1+ " by "+num2+ " is " +result);
	//return result;
}
}
}