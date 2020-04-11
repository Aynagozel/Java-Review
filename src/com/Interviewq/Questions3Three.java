package com.Interviewq;

public class Questions3Three {
		public static void main(String[] args) {
			
			// third task
			String str3=" 2342@3049o^@*^&*@%$";
			
			String str2=str3.replaceAll("[^A-Za-z]"," ");
			
			System.out.println(str2.length());
			
			//5th task
			
			String a1a="Spring, Summer, Fall, Winter";
			String[]array=a1a.split(",");
			for(int i =array.length - 1; i >=0; i--) {
				System.out.println(array[i]);
			}
		}
}
