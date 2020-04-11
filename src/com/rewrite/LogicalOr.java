package com.rewrite;

public class LogicalOr {
	public static void main(String[] args) {
		
		//7 days a week
		//if days is 2 or 4 --> SDLC class
		//if day is 6 or 7 --> Java class
		// if day is 1 or 5 --> No class
		//id day =3 --> review class
		
		int day=7;
		//false or false --> false
		if(day==2 || day==4) {
			System.out.println("SDLC class");
		}else if(day==6 || day==7) {
			System.out.println("Java class");
		}else if (day==1 || day==5) {
			System.out.println("No class");
		}else if(day==3) {
			System.out.println("Review class");
		}else {
			System.out.println("Not a valid day");
		}
		// 7 days a week
		//if day Tuesday or Thursday
		//if day Saturday or Sunday
		// if day Monday or Friday
		//if day is Wednesday --> review class
		
		String weekDay="Friday";
		
		if(weekDay.equals("Tuesday") || weekDay.equals("Thursday")){
			System.out.println("SDLC Class");
		}else if(weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
			System.out.println("Java Class");
		}else if(weekDay.equals("Monday") || weekDay.equals("Friday")) {
			System.out.println("No Class");
		}else if(weekDay.equals("Wednesday")) {
			System.out.println("Review Class");
		}else {
			System.out.println(" Not a valid day");
		}
		int day1 =7;
	
		if(day1==1 && day1==2) {
			System.out.println("weekday");
		}else if(day1==3 && day1==4) {
			System.out.println("weekday");
		}else if(day1==5 && day1==6) {
			System.out.println("weekend");
		}else if(day1==7) {
			System.out.println("weekend");
		}else {
			System.out.println("Invalid day");
		}
		
	}
}
