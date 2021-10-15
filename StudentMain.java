package Laptop;

import java.util.Arrays;

public class StudentMain {
	
	public static void main(String[]args){
		
		 StudentBluprint s1 = new  StudentBluprint();
		 StudentBluprint s2 = new   StudentBluprint();
		 StudentBluprint s3 = new    StudentBluprint();
		 
		 
		 // s1 details
		 
		 s1.id = 105;
		 s1.name = "Roshni";
		 int marks1[] = {23,89,45,78,90};
		 s1.marks = marks1;
		 
		 
		 
		 s2.id = 106;
		 s2.name = "Sourabh";
		 int marks2[] = {89,90,45,36,12};
		 s2.marks = marks2;
		 
		 
		 
		 s3.id = 107;
		 s3.name = "Mulchandani";
		 int marks3[] = {78,34,78,56,23};
		 s3.marks = marks3;
		 
		 
System.out.println("***************s1 student details*********");
System.out.println("ID: "+ s1.id);
System.out.println("Name : " + s1.name);
System.out.println("Marks : "  +Arrays.toString(s1.marks));
System.out.println("Percentage :  " + s1.getPercentage() + "\n");


System.out.println("***************s2 student details*********");
System.out.println(s2.toString());


System.out.println("***************s3 student details*********");
System.out.println("ID: "+ s3.id);
System.out.println("Name : " + s3.name);
System.out.println("Marks : "  +Arrays.toString(s3.marks));
System.out.println("Percentage :  " + s3.getPercentage() + "\n");


		
		
	}

}
