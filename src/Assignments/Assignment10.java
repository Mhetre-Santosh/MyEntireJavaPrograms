package Assignments;  // Assignment 10 = Find the area and circumference of the circle using final variable concept

public class Assignment10 {
	
	static void circle()
	{
		final double pi = 3.14;
		int r = 5;
		
		double A =  pi * r *r;
		
		System.out.println("Area of circle = " +A + " mm^2");
		
		double C =  2 * pi * r;
		
		System.out.println("Circumference of circle = " +C + " mm");
		
	}

	public static void main(String[] args) 
	
	{
		 circle();

	}

}
