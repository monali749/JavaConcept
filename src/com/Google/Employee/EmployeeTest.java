package com.Google.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
	 
		Employee.empCompany = "Google" ;
		Employee obj1 = new Employee();
		obj1.empID=101;
		obj1.empName= "Jack";
		obj1.empSalary=3000;
		Employee.printEmployeeDetails(obj1);
		
		Employee obj2 = new Employee();
		
		obj2.empID=102;
		obj2.empName= "Rick";
		obj2.empSalary=3500;
		Employee.printEmployeeDetails(obj2);
		
Employee obj3 = new Employee();
		
		obj3.empID=103;
		obj3.empName= "Sack";
		obj3.empSalary=4500;
		Employee.printEmployeeDetails(obj3);
		
		Employee HP = Employee.getHeighestPaidEmployeeDetails(obj1, obj2);
		System.out.println("Heighest paid employee details are:");
		Employee.printEmployeeDetails(HP);

	}

}
