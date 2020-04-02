package com.Google.DataTypes;

public class DatatypesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//premitive data type int, flaot, double, byte, long, short etc
		
		//byte b=100;
		//System.out.println(b);
		
		int c= 456;
		//System.out.println(c);
		
		float f =1.2f;
		//System.out.println(f);
		
		double d= 1.4566;
		//System.out.println(d);
		
		d=f;
		//System.out.println(d);
		
		
		// Non- primitive data types
		
		System.out.println("*****Storing the values of an array into the String******");
		
		char[] chr= new char[2];
		chr[0]= 'H';
		chr[1]= 'i';
		
		String name1 = new String(chr);
		System.out.println(name1);
	
		System.out.println("*********Defined String directly*********");
		
		String name= "blue";
		
		System.out.println(name);
		
		System.out.println("*********Integer array************");
		
		int [] a = new int[4];
		 System.out.println(a); //print the address where veriable a is pointing out in memory location
		 
		 int[] b= {1,3,4,5}; // another way of difining interger array
		 
		 a[0]= 10;
		 a[1]=15;
		 System.out.println(a[0]);
		 System.out.println(a[1]);
		 System.out.println(a[2]); //since we didn't store the value, it will display by default value as 0
		 System.out.println(a[3]);
		 
		 System.out.println("*******Character array***********");
		 
	/*char[] ch = new char[4];
	
	int size= ch.length;
	System.out.println("size of an array is:");
	System.out.println(size);
	
	System.out.println(ch);*/
	
	char[] ch ={'j','a','c','k'};
	
	/* ch[0] = 'j';
	 ch[1] = 'a';
	 ch[2] = 'c';
	 ch[3] = 'k';*/
	 System.out.println(ch);
	
	
	}

}
