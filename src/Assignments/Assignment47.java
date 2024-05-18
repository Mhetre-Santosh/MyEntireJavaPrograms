package Assignments; //  Assignment47 = Write a Program on creating method 
                     //with LOCAL variable by using FINAL keyword  also try with Global variable

public class Assignment47 {
	
	static int r = 100;
	static final double pi = 3.14;
	static double G = pi*r*r;
	static double GC =  2 * pi * r;
	
	static void circle()
	{
		final double pi = 3.14;
		int r = 5;
		
		double A =  pi * r *r;
		
		System.out.println("local v. o/p = Area of circle = " +A + " mm^2");
		
		double C =  2 * pi * r;
		
		System.out.println("local v. o/p = Circumference of circle = " +C + " mm");
		
	}

	public static void main(String[] args) 
	
	{
		 circle();
		 
		 System.out.println("Global v. o/p = Area of circle = " +G+ " mm^2");
		 System.out.println("Global v. o/p = Area of circle = " +GC+ " mm");

	}


}
