package com.rewrite3;

public class TwoDArrayDemo2 {
	public static void main(String[] args) {
		String[][]names= {
				{"Khan", " yousuf", "Alex"},
				{"Mohammed", "Ann", " Nas"},
				{"Dio", " asif", " ziub"},
		};
		int lengthOfRows=names.length;
		System.out.println(lengthOfRows);
		
		int lengthOfCols=names[1].length;
		System.out.println(lengthOfCols);
		
		for(String getArray[]:names) {
			for(String getName: getArray) {
				System.out.print(getName+" ");
			}
			System.out.println();
		}
	}
}
