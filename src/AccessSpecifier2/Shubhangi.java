package AccessSpecifier2;  

public class Shubhangi 
{
	public void add()
	{
		System.out.println("1");
	}
	
	private void sub ()
	{
		System.out.println("2");
	}

	protected void mul()
	{
		System.out.println("3");
	}
	
	void div ()
	{
		System.out.println("4");
	}

	public static void main(String[] args)
	{
		Shubhangi y = new Shubhangi();    // with in the class all access specifier is accessible.
		
		y.add();
		y.sub();
		y.mul();
		y.div();

	}

}
