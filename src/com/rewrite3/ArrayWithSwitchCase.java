package com.rewrite3;

public class ArrayWithSwitchCase {
	public static void main(String[] args) {
		
		/*Create an array of countries.
		 * While retrieving all values from an array
		 * print capital gfor each country
		 */

		String[] countries = { "Turkmenistan", "Turkey", " Afganistan", " Russia", "USA" };
		for (int i = 0; i < countries.length; i++) {
			switch (countries[i]) {
			case"Turkmenistan":
				System.out.println("Ashgabat");
				break;
			case"Turkey":
				System.out.println("Ankara");
				break;
			case"Afganistan":
				System.out.println("Kabul");
				break;
			case"Russia":
				System.out.println("Mockow");
				break;
			case"USA":
				System.out.println("Washington DC");
				break;
			default:
				System.out.println(countries[i]);

			}
		}
	}
}