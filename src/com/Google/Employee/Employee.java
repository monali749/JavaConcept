package com.Google.Employee;

public class Employee {
	
    public int  empID;
	public String empName;
	public double empSalary;
	public static String empCompany;
	
	//static Method to print employee details
	
	public static void printEmployeeDetails(Employee x)
	{
		
		System.out.println(x.empID);
		System.out.println(x.empName);
		System.out.println(x.empSalary);
		System.out.println(Employee.empCompany);
		
				
	}
	
	public static Employee getHeighestPaidEmployeeDetails(Employee x, Employee y)
	{
		if(x.empSalary > y.empSalary)
		{
			return x;
		}
		else
		{
			return y;
		}
	}
}