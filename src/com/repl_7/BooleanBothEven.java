package com.repl_7;

class BooleanBothEven{
	
	static boolean bothEven(int num1, int num2) {
		boolean isBothSame;
		if(num1%2==0 && num2%2==0) {
			isBothSame=true;
		}else {
			isBothSame=false;
		}
		return isBothSame;
	}
	public static void main(String[] args) {
		System.out.println(bothEven(-1,1));
	}
}
