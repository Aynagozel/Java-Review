package com.class34_repl;

import java.util.ArrayList;

public class Main4 {
	public static void main(String[] args) {
		
		ArrayList<String>arrlist=new ArrayList<String>();
		
		arrlist.add("hi");
		arrlist.add("yo");
		arrlist.add("sup");
		arrlist.add("yolo");
		arrlist.add("boop");
		
		arrlist.remove(0);
		arrlist.remove(1);
		arrlist.remove(2);
		for(String object:arrlist) {
			System.out.print(object+" ");
		}
	}
}
