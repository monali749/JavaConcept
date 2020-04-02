package com.Google.Methods;

public class Area {
	public static double areaOfCircle(int radius)
	{
		double result = 3.14* radius * radius;
		return result;
	}

	public static int areaOfRectangle(int length, int width)  //Static Method
	{
		int result = length * width;
		return result;
	}
	
	public  double areaOfTriangle(double height, double base) //Non static Method
				{
		double result= (height*base)/2;
		return result;
	}

}
