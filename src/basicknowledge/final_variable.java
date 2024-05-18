 package basicknowledge;  

public class final_variable {
	
	static void circle ()
	{
		final double pi = 3.14;
		int r = 10;
		double a = pi * r * r;
		double c = 2 * pi * r; 
		
		System.out.println("Area of cicle =  "+a );
		System.out.println("Circumference of circle = "+c);
	}
	public static void main(String[] args)
	{
		circle();

	}

}
