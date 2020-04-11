package com.Interviewq;

public class Questions5 {
	public static void main(String[] args) {

		int[] array = { 5, 9, 8, 7 };
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println(max);
	}
}
