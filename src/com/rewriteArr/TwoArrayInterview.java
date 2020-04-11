package com.rewriteArr;

public class TwoArrayInterview {
	public static void main(String[] args) {
		int [][]numbers={ { 2, 5 }, 
                { 12, 23, 45 }, 
                { 4, 7, 9, 0 } 
                }; 
		
		 //standard for loop , based on index
        for (int i = 0; i < numbers.length; i++) {
          for (int j = 0; j < numbers[i].length; j++) {
               System.out.print(numbers[i][j]+" ");          
              }
        }System.out.println("//////");
        //enhanced/advanced/ for each loop ---> only forword direction
        int sum=0;
        for(int[] number:numbers) {
        	for(int num:number) {
        		System.out.print(num+" ");
        		if(num%2==0) {
        			sum+=num;
        		}
        	}
        }
        System.out.println(sum);

	}
}
