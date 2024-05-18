package ThisCallingStatement;

public class School_College 
{
	School_College()
	{
		this(10);
		System.out.println("1");
	}
	
	School_College(int a)
	{
		this("Santosh");
		System.out.println("2");
	}
	
	School_College(String a)
	{
		this ('a',"santosh");
		System.out.println("3");
	}
	
	School_College(char a, String b)
	{
		System.out.println("4");
	}

	public static void main(String[] args) 
	{
		new School_College ();
	}

}
