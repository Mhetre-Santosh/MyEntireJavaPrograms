package Assignments; // Assignments 4 = Program to write both static and non-static method  in a class.

public class Assignments4 {
	
	static void Add1()   // static method 
	{
		int a = 100;
		int b = 200;
		System.out.println(a+b);
	}
	
	void Add()   // non-static method
	{
		int a = 200;
		int b = 200;
		System.out.println(a+b);
	}

	public static void main(String[] args)
	{
		Add1();
		
		Assignments4 x = new Assignments4 ();  // object for non-Static
		
		x.Add();
		
	}

}
