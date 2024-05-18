package basicknowledge;

class StudentClass
{
	StudentClass (int a)
	{
		System.out.println("StudentClass");
	}
	
}

public class Invoking_Constructor {
	
	Invoking_Constructor()
	{
		System.out.println("Invoking_Constructor");
	}
	

	public static void main(String[] args)
	{
		new Invoking_Constructor();
		new StudentClass (99);
	}

}
