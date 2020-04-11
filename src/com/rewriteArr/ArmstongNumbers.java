package com.rewriteArr;

public class ArmstongNumbers {
	public static void main(String[] args) {
		//Factorial
		//InterviewQuestions
		int number=10;
		int factorialSum=1;
		for(int i=1; i<=number; i++) {
			factorialSum=factorialSum*i;
		}
		System.out.println("Factorial of "+number+ " is "+factorialSum);
		//sum of Digits
		int num=13465;
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num=num/10;
		}
		System.out.println(sum);
		
		//Armstrong Number
		int sum1=0;
		int digit;
		int temp;
		int number1=370;
		temp=number1;
		
		while(temp>0) {
			digit=temp%10;
			sum1=sum1+(digit*digit*digit);
			temp=temp/10;
		}
		if(number1==sum1) {
			System.out.println(number1+ " is an Armsrong number");
		}else {
			System.out.println(number1+" is not an Armstrong number");
		}
	}
}
