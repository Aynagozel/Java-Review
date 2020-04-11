package com.Interviewq;

public class Questions8 {
	public static void main(String[] args) {
		
		double i=1;
		        double fb;
		        double num=Math.sqrt(5);
		        double num2=(1+num)/2;
		        double num3=(1-num)/2;
		        for(;i<11;i++) {
		        fb=(1/num)*(Math.pow(num2,i)-Math.pow(num3,i));
		        int f=(int) fb;
		        System.out.println(f);
		        } 


	}
}