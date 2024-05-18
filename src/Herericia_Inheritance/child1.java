package Herericia_Inheritance;

public class child1 extends parent
{
	static void div()
	{
		System.out.println("Division");
	}
	public static void main(String[] args) 
	{
		child1 x = new child1();
		
		div();
		add();
		x.sub();

	}

}
