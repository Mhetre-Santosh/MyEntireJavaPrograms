package Assignments;  // Assignment 13 = order of execution when we have MM,IIB,SIB,constructor

public class Assignment13
{

	static  // SIB
	{
		System.out.println("SIB");
	}
	
	{       //IIB 
		System.out.println("IIB");
	}
	
	Assignment13()
	{
		System.out.println("Constructor");
	}

	public static void main(String[] args)
	{
		System.out.println("Main Method");
		new Assignment13();	
	}

}
