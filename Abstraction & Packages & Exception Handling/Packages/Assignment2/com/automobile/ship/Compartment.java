package com.wipro.automobile.ship;

public class Compartment {

	private double height;
	private double width;
	private double breadth;
	
	public Compartment(double height, double width, double breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	void display() {
		System.out.println("Height, width and breadth of ship are : "+height+" , "+width+ " , "+breadth);
	}
}
