package basicknowledge;

public class Methodoverloading {
	
	void add ()     // Non-Static Method 
	{
		int a = 100;
		System.out.println(a+6);
	}
	
	void add (int a)             // Non-Static Method overloading with Arguments/parameter
	{
		System.out.println(a+6);
	}
	
	static void add (double a, int b)  // Static Method overloading with double parameter
	{
		System.out.println(a+b+6);
	}
	
	void add (int a, int b, int c, int d)  // Non-Static Method overloading with 4 Arguments/parameter
	{
		System.out.println(a+b+c+d);
	}

	public static void main(String[] args) 
	{
		Methodoverloading x = new Methodoverloading (); // object for Non-Static Method
		x.add();                                        // object for Non-Static Method
		x.add(9000);                                    // object for Non-Static Method with Arguments/parameter
		add(0.09,9000);                                 // object for Static Method 
		x.add(11,11,11,0);                              // object for Non-Static Method with 4 Arguments/parameter
		
	}

}
