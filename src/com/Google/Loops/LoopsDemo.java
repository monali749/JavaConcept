package com.Google.Loops;

public class LoopsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//print table of 5
		int i;
		for(i=5; i<=50; i=i+5)
		{
			System.out.println(i);
		}
		
		//Define an integer array and print the values greater than 30 
		//using for loop
		/*
		
		int[] numbs = {5,8,9,12,27,30,45,78};
		
		int size = numbs.length;
		
		System.out.println(size);
		
		for( int i=0; i<size; i++)
			
		{
			if(numbs[i]>= 30)
			System.out.println(numbs[i]);
		}
		
		
		//Advanced for loop
		//integer array using Advanced for loop
		
              int[] numbers = {1,3,6,8,9,23,56};
   
               for (int var : numbers)
               {
            	   System.out.println(var);
               }
		
		//String using advanced for loop
		String[] names = {"King", "Queen", "Jack"};
		
		for(String var: names)
		{
			System.out.println(var);
		}
		*/
		
		String[] names = {"king", "queen", "jack"};
		for(String var: names)
		{     
			if(var != "jack")
			System.out.println(var);
		}
	}

}
