package com.manupulation;

public class RegularExpretion2 {
	public static void main(String[] args) {
		
		String str="Today is our java class";
		System.out.println(str.replace(" ", ""));
		
		System.out.println("******************");
		System.out.println(str.replaceAll("\\s", ""));
		
		String doc="Video provides a powerful way to help you "
				+ " "
				+ "you can paste for the embed code the video you "
				+ "you want add. You can also type a keyword to search "
				+ "online for the video that best fits your document.";
		System.out.println(doc.toLowerCase().replace("video", "Audio "));
		System.out.println(doc.replaceAll("powerful(.*)", ""));
			
	}
}
