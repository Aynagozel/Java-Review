package com.class34_repl;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	public class Main5 {
		public static void main(String[] args)	{
			List<Integer> listA = new ArrayList<>();
			for (int i = 0; i <= 5; i++) {
				listA.add(i);
			}

			List<Integer> listB = new ArrayList<>();
			listB.addAll(listA);
			listB.addAll(listA);
			Collections.sort(listB);
			System.out.println(listB);
		}
	}
