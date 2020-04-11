package com.rewrite;

public class PrimativeCasting {
	public static void main(String[] args) {
		//FYI - for your informnation
		double d=12;
		System.out.println(d);
		
		//int i=12.0; compile time error
		//widening or automatioc or implicit casting
		byte b=127;// you can put byte in the integar
		int i=b;
		System.out.println(b);
		
		// narrowing or explicit or manual casting
		double d2=123.56;
		int num2=(int)d2;
		System.out.println(num2);
		
		int num3=789;
		byte b1=(byte)num3;
		System.out.println(b1);
	}
}
