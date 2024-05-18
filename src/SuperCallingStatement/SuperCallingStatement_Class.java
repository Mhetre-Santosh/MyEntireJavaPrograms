package SuperCallingStatement;

class College
{
	College()
	{
		System.out.println("College");
	}
	
}

class School extends College
{
	School()
	{
		System.out.println("School");
	}
}

public class SuperCallingStatement_Class   // no relation with parent class
{

	public static void main(String[] args) 
	{
	    new School();   // creating direct object of parent class as there no relation between child and parent
	
	}

}

// o/p is College & School