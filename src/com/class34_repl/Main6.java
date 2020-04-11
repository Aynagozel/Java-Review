package com.class34_repl;
import java.util.ArrayList;
public class Main6 {
	public static void main(String[] args) {
		ArrayList <Boolean>listA = new ArrayList<Boolean>();
		listA.add(true);
		listA.add(false);
		listA.add(false);
		
		ArrayList <Boolean>listB = new ArrayList<Boolean>();
		for (int i = 0; i <2 ; i ++) {
			for (int j = 0; j<listA.size(); j++) {
				listB.add(listA.get(j));
			}
		}
		
		System.out.println(listB);
	}
}

