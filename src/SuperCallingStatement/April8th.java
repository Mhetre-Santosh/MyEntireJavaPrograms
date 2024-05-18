package SuperCallingStatement; //  Assignment 33 = Program to demonstrate SUPER() CALLING statement

class parent_class
{
	parent_class()
	{
		System.out.println("Grand Parent");
	}
}

class child_class extends parent_class
{
	child_class()
	{
		super();    // it is always present no mater written or not
		System.out.println("Parent"); 
	}
	
}
public class April8th extends child_class
{
	
	April8th()
	{
		 super();
		 System.out.println("child");
	}

	public static void main(String[] args) 
	{
		new April8th();
		
	}

}
