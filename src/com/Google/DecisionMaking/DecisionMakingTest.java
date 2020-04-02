package com.Google.DecisionMaking;

public class DecisionMakingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		System.out.println("Hello"=="Hello");
		
		String expectedTitle= "Google1";
		
		if(expectedTitle == "google" || expectedTitle == "Google")
		{
			System.out.println("Test passed");
		}
		else
		{ System.out.println("Test failed");
		
		}
		
		System.out.println("*************Displaying grades**********");
		
		int marks= 10;
		
		if(marks>=90 && marks<=100)
		{
			System.out.println("Grade A");
		}
		else if(marks >=80 && marks<=89)
		{
			System.out.println("Grade B");
			}
		else if(marks>=70 && marks<=79)
		{
			System.out.println("Grade C");
			
		}
		
		else if(marks>=60 && marks<=69)
		{
			System.out.println("Grade D");
			
		}
		
		else if(marks>=50 && marks<=59)
		{
			System.out.println("Grade E");
			
		}
		else if(!(marks<50 && marks >=0))
		{
			System.out.println("invalid marks, you have entered either a negative number or a number greater than 100. Please verify the number.");
			
		}
		else
		{
			System.out.println("Grade F- failed");
			
			
		}
		
		
		
		
	}

}
