package basicknowledge;

public class Conparametrized {
	
	Conparametrized()                                   // Non-Parameterized Constructor.
	{
		System.out.println("Non-Parameterized");
	}
	
	Conparametrized(int a)                              // Parameterized Constructor
	{
		System.out.println("Parameterized");
	}

	public static void main(String[] args) 
	{
		new Conparametrized();                        // Non-Parameterized object.
		new Conparametrized(32000);                   // Parameterized object.

	}

}
