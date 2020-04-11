package com.Interviewq;

public class Questions3 {
	
	public static void main(String[] args) {
		
		int[] numArray= {15, 20,25,30,35,40};
		
		int secondLargest=0;
		
		int largest=numArray[0];
		
		for(int i=0; i<numArray.length;i++) {
			
			if(numArray[i]>largest) {
				
				secondLargest=largest;
				
				largest=numArray[i];
				
			}else if(numArray[i]>secondLargest && numArray [i]!=largest) {
				
			}
				secondLargest=numArray[i];
					
				}
			System.out.println("The largest number is = " + largest);
			System.out.println("Second largest number is = " + secondLargest);

			
	}

}