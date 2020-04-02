package com.Google.Methods;

public class MethodTest {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Area of circle
		
		int r =2;
		//double  P = 3.14f;
		
		
		//double AC = P*(r*r);
		
		//double AC =3.14 *r*r;
		
		//System.out.println(AC);
		
		        double AC = Area.areaOfCircle(r);
				System.out.println(AC);
				
				//Area of Rectangle
				
				int l=10;
				int w=20;
				
				int AR = Area.areaOfRectangle(l, w);
				System.out.println(AR);
				
				//Area of triangle
				
				double h= 20;
			   double b=5;
				
			   Area obj = new Area();
				double AT = obj.areaOfTriangle(h ,b);
				System.out.println(AT);
						
	}

}
