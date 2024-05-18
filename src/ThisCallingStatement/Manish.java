package ThisCallingStatement;  // Assignment 34 = Program to demonstrate THIS() CALLING statement

public class Manish
{
	Manish ()
	{
		this (100);
		System.out.println("1");
	}
	
	Manish(int a)
	{
		this(10.10  );
		System.out.println("2");
	}
	
	Manish(double a)
	{
		System.out.println("3");
	}
	public static void main(String[] args)
	{
		new Manish();
		
				

	}

}
