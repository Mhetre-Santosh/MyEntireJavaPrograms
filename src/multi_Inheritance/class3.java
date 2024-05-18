package multi_Inheritance;

public class class3 extends class2
{
	static void mul()
	{
		System.out.println("Multiplication");
	}

	public static void main(String[] args)
	{
		class3 x = new class3();  // Creating object of child class (class3) To call non Static method of child class 1&2
		
		x.sub();  // calling non static method of class2
		x.add();  // calling non static method of class1
		mul();

	}

}
