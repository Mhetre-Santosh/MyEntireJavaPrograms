package basicknowledge;

public class ConOverloading {
	
	ConOverloading ()
	{
		System.out.println("Non-Parameterized");   // Non-parameterized constructor
	}
	ConOverloading(int a)
	{
		System.out.println("Parameterized");   // object for parameterized constructor  
	}
	
	ConOverloading(String a)
	{
		System.out.println("Santosh");   // string parameterized constructor
	}
	
	ConOverloading(int a, double b)    // Double parameterized constructor
	{
		System.out.println("Double Parameterized");
	}

	public static void main(String[] args) 
	{
		new ConOverloading ();            // object for Non-parameterized constructor
		new ConOverloading (32000);       // object for parameterized constructor  
		new ConOverloading ("1");         // object for string parameter constructor
		new ConOverloading (100,90.76);   // object for Double parameterized constructor
	}

}
