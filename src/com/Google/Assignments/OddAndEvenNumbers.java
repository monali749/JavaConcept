package com.Google.Assignments;

import java.util.Scanner;

public class OddAndEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*int a[]= {2,5,1,4,7};  //find out odd and even numbers from an array
		
		int size= a.length;
		
		for(int i=0; i<size; i++)
		{
			if(a[i]%2==0)
			{


				System.out.println(a[i]);
				System.out.println("is an even number");
			}
			else
			{
				System.out.println(a[i]);
				System.out.println("is an odd number");
			
			}
				
		}*/
		
		int n=30;
		System.out.print("program to print Even Numbers  and odd numbers from 1 to "+n+" : \n ");
		for(int i=1; i<=30; i++)
		{
			if(i%2==0)
			{
				System.out.println("Number \t"  + i +  " is an even number");
			}
			else
			{
			     System.out.println("NUmber \t"  + i +  " is an odd number");
			}
			
		}
		
		/*Scanner reader = new Scanner(System.in); //program using scanner class

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");*/
		
	}

}
