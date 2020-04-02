package com.Google.Student;

public class Student {
	
	
	public int studentRollno;
	public String studentName;
	public String studentEmail;
	public String studentAddr;
	public static String schoolName;
	public static String schoolAddr;
	public int studentPercentage;
	
	public static void getStudentDetails(Student x)
	{
		System.out.println(x.studentRollno);
		System.out.println(x.studentName);
		System.out.println(x.studentEmail);
		System.out.println(x.studentAddr);
		System.out.println(x.studentPercentage);
		System.out.println(Student.schoolName);
		System.out.println(Student.schoolAddr);
	}
	
	
	public static Student getLowPercentageDetails(Student x,Student y, Student z)
	{
		if(x.studentPercentage <= y.studentPercentage && x.studentPercentage <= z.studentPercentage)
		{
			return x;
		}
		else
			if(y.studentPercentage <= x.studentPercentage && y.studentPercentage <= z.studentPercentage)
			{
				return y;
			}
			else 
			{
				return z;
			}
	}

}
