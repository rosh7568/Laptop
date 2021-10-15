package Laptop;

import java.util.Arrays;

public class StudentBluprint {
	      
	int id;
	String name;
	int[] marks = new int[5];
	
	float getPercentage() {
		
		float percentage = 0.0f;
		int sum = 0;
		for(int i =0; i<5 ; i++) {
			
			
			sum = sum + marks[i];
		}
		      percentage =(float) sum /5;
		      return percentage;
		
	}
	
	  public String toString() {
		  
		  
	return	  "ID : " + id  + "\n" +
		  "Name : " + name  + "\n"  +
		  "Marks : "  +Arrays.toString(marks) + "\n" +
		  "Percentage :  " + getPercentage() + "\n";

		  
		  
	  } 

}
