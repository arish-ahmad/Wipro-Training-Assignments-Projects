package com.mile1.main;

import java.util.Scanner;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;

public class StudentMain {
	static Student data[] = new Student[6];
	static {
		try {
			 data [0] = new Student (new int[ ] {72, 73, 74}, "A1"); 
			 data [1] = new Student (null, "B1");    				 // marks array is null
			 data [2] = new Student (new int[ ] {99, 99, 99},null);  //name is null
			 data [3] = new Student (new int[ ] {100, 100, 99},"A2"); 
			 data [4] = new Student (new int[ ] {13, 88, 13},"A3"); 
			 data [5] = new Student (null ,  null); 				//entire object is null
		
		}catch(Exception e) {
		}
	}
	public static void main(String[] args) throws NullNameException, NullStudentObjectException, NullMarksArrayException {
		// TODO Auto-generated method stub
		int NumberOfNullMarks=0;
		int NumberOfNullNames=0;
		int NumberOfNullObjects=0;
		
		StudentReport SR1 = new StudentReport();
		StudentService SS1 = new StudentService();
		
		System.out.println("Grades Calculation: ");
		String x = "";
		
		for(int i=0;i<data.length;i++) {
			try {
			x = SR1.Validate(data[i]);
			}catch (Exception e) {
				x = e.toString();
			}
			System.out.println("Grade of Student object"+(i+1)+" = "+x);
		}
		NumberOfNullNames = SS1.findNumberOfNullMarksArray(data);
		NumberOfNullObjects = SS1.findNumberOfNullObjects(data);
		NumberOfNullMarks = SS1.findNumberOfNullMarksArray(data);
		System.out.println("Number of objects with Marks array as null = "+NumberOfNullMarks);
		System.out.println("Number of objects with Name as null = "+NumberOfNullNames);
		System.out.println("Number of objects that are entirely null = "+NumberOfNullObjects);
			
	}

}
