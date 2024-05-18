package Inheritance; // Assignment 28 = Program to demonstrate SINGLE LEVEL INHERITANCE
class parent1_class{
	
	void add()
	{
		System.out.println("Addition");
	}
	void sub()
	{
		System.out.println("Subtraction");
	}

}
public class child1 extends parent1_class {
	
	void mul()
	{
		System.out.println("Multiplication");
	}

	public static void main(String[] args)
	{
		child1 x = new child1();
		x.add();
		x.sub();
		x.mul();

	}

}
