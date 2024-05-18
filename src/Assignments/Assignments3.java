package Assignments;  // Assignments 3 = Non-static method Program for add,sub,multiplication,division,modules.
public class Assignments3 {
	void Add ()
	{
		int a = 100;
		int b = 200;
		System.out.println(a+b);
	}
	void Sub ()
	{
		int a = 300;
		int b = 200;
		System.out.println(a-b);
	}
	void mul()
	{
		int a = 10;
		int b = 5;
		System.out.println(a*b);
	}
	void div ()
	{
		int a = 400;
		int b = 100;
		System.out.println(a/b);
	}
	void mod()
	{
		int a = 300;
		int b = 200;
		System.out.println(a%b);
	}
	public static void main(String[] args) 
	{
		Assignments3 x = new Assignments3 ();  // object to call non-static methods.
		x.Add();
		x.Sub();
		x.mul();
		x.div();
		x.mod();	
	}
}
