package com.rewriteArr;

public class GetNames {
	public static void main(String[] args) {
		String[][]name= {
				{"Chary","Cumas", "Durdy"}
		};
		for(String get[]:name) {
			for(String getName:get) {
				System.out.println(getName);
			}
		}
		String[][]names= {
				{"Chary","Cumas", "Durdy"}
		};
		for(String getName[]:names) {
			for(String get:getName) {
				System.out.print(get+" ");
			}
		}
		int[][]arr= {
				{1,2,3}	
		};
		for(int nums[]:arr) {
			for(int get:nums) {
				System.out.print(get+" ");
			}
		}
		int[][]arr1= {
				{1,2,3}	
		};
		for(int dur[]:arr1) {
			for(int al: dur) {
				System.out.print(al+ " ");
			}
		}
		String[][]at= {
				{"Chary","Cumas", "Durdy"}
		};
		for(String ady[]:at) {
			for(String familya:ady) {
			System.out.print(familya+" ");
		}
		}
		int[][]nomr= {
				{1,2,3}	
		};
		for(int sany[]:nomr) {
			for(int ady: sany) {
				System.out.print(ady+ " ");
			}
		}
	}
}
