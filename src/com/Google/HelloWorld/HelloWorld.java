package com.Google.HelloWorld;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World");

//String[] names = new String[3];
/*names[0]= "King" ;
names[1]= "Queen";
names[2]= "Jack";
 System.out.println(names[0]);
 System.out.println(names[1]);
 System.out.println(names[2]);*/
System.out.println("---------------------------");
String[] names=  {"King", "Queen", "Jack"};
System.out.println(names[0]);
System.out.println(names[1]);
System.out.println(names[2]);

System.out.println("..........Printing values using advanced for loop........");

for (String var: names)  //printing values stored in names using advanced for loop
{
	System.out.println(var);
}

	}

}
