package com.mile1.bean;

public class Student {
	String name;
	int marks[];
	
	public Student(int[] marks, String name) {
		this.marks = marks;
		this.name = name;
	}
	//name getter
	public String getName() {
		return name;
	}
	//name setter
	public String setName(String name) {
		return name;
	}
	// marks getter 
	public int[] getMarks() {
		return marks;	
	}
	//marks setter 
	public int[] setMarks(int[] marks) {
		return marks;
	}
}

