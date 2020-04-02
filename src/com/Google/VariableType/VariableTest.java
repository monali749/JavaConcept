package com.Google.VariableType;

public class VariableTest {
	
	private static int aS=10;  //static variable or class variable
	
	private static int bS=20;
	
	private int aNS=10;        //non static variable or instance variable
	private int bNS=20;

	public static void main(String[] args) {
		
		System.out.println("....Printing the values of Static variables.....");
		System.out.println(VariableTest.aS);
		VariableTest.bS=40;
		System.out.println(VariableTest.bS);
		
		
		VariableTest obj1= new VariableTest();
		
		System.out.println("...Printing values of non static variables...");
		
		System.out.println(obj1.aNS);
		
		obj1.bNS=40;
		System.out.println(obj1.bNS);
		
		VariableTest obj2 = new VariableTest();  // we have created another object obj2 , it will have all non static fields
		                                         //i.e. when we run the program aNS, bNS will be loaded in obj1 also and in obj2 also.                                            
		 
		System.out.println("printing an address");
		System.out.println(obj2);
		System.out.println(obj2.aNS);
		System.out.println(obj2.bNS);
		
		VariableTest obj3 = new VariableTest();
		obj1=obj3;
		
		System.out.println(obj1.aNS);
		System.out.println(obj1.bNS);
		System.out.println(obj3.aNS);
		System.out.println(obj3.bNS);
		
		obj2.bNS=60;  //changing the values of non static variable bNS where obj2 is pointing
		
		obj1=obj3=obj2;  //obj1 and obj3 is pointing to obj2 location
		obj1.aNS=70;    // changing the values of non static variable aNS where obj is pointing, here obj1 is pointing to obj2 location
		

		System.out.println(obj1.aNS);
		System.out.println(obj1.bNS);
		System.out.println(obj3.aNS);
		System.out.println(obj3.bNS);
		
	}

}
