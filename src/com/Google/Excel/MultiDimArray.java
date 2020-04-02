package com.Google.Excel;

import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;

public class MultiDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] num= {1,4,6,9,2,6,8,5};
	 int len= num.length;
	 System.out.println("This is a single dimentional array");
	 System.out.println("Array length is:" + len);
	 for(int i=0; i<len; i++)
	 {
		 System.out.println(num[i]);
	 }
	 

//single dimentional string array by taking user inputs
	
	     Scanner sc= new Scanner(System.in);
	     System.out.println("Enter row length of an array:\n");
	     int row=sc.nextInt();
	     System.out.println("Enter column lenth of an array:\n");
	     int col= sc.nextInt();
	     int[][] a = new int[row][col];
	     System.out.println("Enter" +(row*col) + "elements into an array :\n");
	     
	     for(int i=0; i<row; i++)
	     {
	    	 for(int j=0; j<col; j++)
	    	 { 
	    		 System.out.println("Enter" +(j+1)+ " \t element in an array: \n" );

	    		 a[i][j]=sc.nextInt();
	    			   
	    	 }
	     }
	     System.out.print("Elements in Array are :\n");	 

for(int i=0; i<row; i++)
{
	for(int j=0; j<col; j++)
	{
		System.out.println(a[i][j]);
	}
}
	             
         
         
         
         

	    	 
	  }

		
	}
		
	
