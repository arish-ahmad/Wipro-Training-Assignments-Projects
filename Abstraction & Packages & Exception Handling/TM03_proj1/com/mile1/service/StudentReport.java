package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentObjectException;

public class StudentReport {

	public String findGrades(Student student){
		int[] marks= student.getMarks();
		String grade = "";
		int totalMarks = 0;
		//checking marks > 35
		for ( int i = 0 ; i<marks.length; i++) {
			if (marks[i]<35) {
				grade = "F";
				break;	
			}
		}
		// adding all marks and return grade
		if (!grade.equals("F")) {
			for (int i =0 ;i <marks.length ; i++)
				totalMarks+= marks[i];
			
			if (totalMarks < 150)
				grade = "C";
			else if (totalMarks < 200)
				grade = "B";
			else if (totalMarks < 250)
				grade = "A";
			else
				grade = "A+";		
		}
		return grade;
	}
	public String Validate(Student s) 
			throws NullNameException, NullMarksArrayException, NullStudentObjectException{
		// checking Student object is null or not
		if (s == null)
			throw new NullStudentObjectException();
		else {
			// checking name is null or not
			if (s.getName() == null)
				throw new NullNameException();
			// checking marks is null or not
			else if (s.getMarks() == null)
				throw new NullMarksArrayException();
			else
				return findGrades(s);
		}
	}
}
