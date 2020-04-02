package com.Google.Student;

public class StudentTest {

	public static void main(String[] args) {
		
		Student.schoolName = "GlobalSchool";
		Student.schoolAddr = "100,Global School ";
		
		
		
		
		Student obj1 = new Student();
		
		
		obj1.studentRollno = 100;
		obj1.studentName = "Ria";
		obj1.studentEmail = "ria123@gmail.com";
		obj1.studentAddr = "#101,lake street, VA";
		obj1.studentPercentage= 70;
		
		System.out.println(".....printing the location address where obj1 is pointing.......");
				
		System.out.println(obj1);
		
		System.out.println("\n");
		
		System.out.println("Student details are:");
		
		Student.getStudentDetails(obj1);

		Student obj2 = new Student();
	
		
		
		obj2.studentRollno = 101;
		obj2.studentName = "Emily";
		obj2.studentEmail = "emilyat72@gmail.com";
		obj2.studentAddr = "#50,rock station, MO";
		obj2.studentPercentage= 40;
		
		System.out.println("\n");
	    System.out.println(".....printing the location address where obj2 is pointing.......");
		
		System.out.println(obj2);
		
		System.out.println("\n");
		
		System.out.println("Student details are:");
		
		Student.getStudentDetails(obj2);
		

		Student obj3 = new Student();
		obj3.studentRollno = 103;
		obj3.studentName = "Kelvin";
		obj3.studentEmail = "kk124567@gmail.com";
		obj3.studentAddr = "1002, fifth avenue, NYC";
		obj3.studentPercentage= 65;
		
		System.out.println("\n"); 
		System.out.println(".....printing location address where obj3 is pointing.......");
			
		System.out.println(obj3);
		
		System.out.println("\n");
			
		System.out.println("Student details are:");
			
		Student.getStudentDetails(obj3);
		
		Student LP = Student.getLowPercentageDetails(obj1, obj2, obj3);
		System.out.println("\n");
		System.out.println("Low Percentage Record Details Are:");
	    Student.getStudentDetails(LP);
	    Student[] students = new Student[4];
		students[0] = obj1;
		students[1] = obj2;
		students[2] =obj3;
		
	}

}
