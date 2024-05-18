package multi_Inheritance;   // Assignment 38 = Demonstrate MULTILEVEL INHERITANCE

class Grand_Parent
{
	static void add ()
	{
		System.out.println("Addition");
	}
}
class Parent extends Grand_Parent
{
	static void sub ()
	{
		System.out.println("Subtraction");
	}
}

public class multi extends Parent 
{
	
		static void mul ()
		{
			System.out.println("Multiplication");
		}


	public static void main(String[] args) 
	{
		add();
		sub();
		mul();

	}

}
