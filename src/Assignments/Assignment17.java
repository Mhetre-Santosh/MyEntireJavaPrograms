package Assignments;            // Assignment 17 = Using Math.random() get the radius of 10 circles & find the area of each circle

public class Assignment17 
{

	public static void main(String[] args)
	{
			
		for (int i = 1; i<= 10; i++)
		{
			double r = Math.random();
			System.out.println("radious of circle "+ r); 
			
			double Area = Math.PI * r*r;
			System.out.println("Area of circle =  "+ Area);
		}
		
		
	}

}
