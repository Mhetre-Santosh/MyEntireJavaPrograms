 package Inheritance;
class Santosh
{
	static void Add ()
	{
		System.out.println("Addition");
	}
}	
public class InheritanceEg extends Santosh
{
	static void Sub ()
	{
		System.out.println("Subtraction");
	}
	
	public static void main (String[] args)
	{
		Add();
		Sub();
		System.out.println("main");
		
	}
}
	


