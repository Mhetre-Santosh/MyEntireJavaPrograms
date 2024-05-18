package Blocks;   // question asked during oracle company interview
public class que {
	
	que()
	{
		System.out.println("Constructor");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Method");
		
		que x = new que();
		que y = new que();
	}
	static 
	{
		System.out.println("SIB 1");
	}
	static
	{
		System.out.println("SIB 2");
	}
	
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
}
