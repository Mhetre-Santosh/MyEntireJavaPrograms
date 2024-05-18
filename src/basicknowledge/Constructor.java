package basicknowledge;

public class Constructor {
	
	Constructor()  // Constructor or Special type of method- method 1
	{
		System.out.println("Constructor");
	
	}
	
	void add ()
	{ 
		System.out.println("Non-Static");  // method 2
	}
	
	static void sub ()
	{
		System.out.println( "Static");  // method3 
	}

	public static void main(String[] args)  // main method - method 4
	{
		Constructor x = new Constructor ();
		Constructor a = new Constructor ();
		new Constructor ();
		x.add();
		a.add();
		sub();
	}

}
