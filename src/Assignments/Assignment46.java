package Assignments;   // Assignment46 = Program to do add,sub,mul,mod using LOCAL variable

public class Assignment46 
{
	static void Add()
	{
		int a= 100;
		int b= 600;
		System.out.println(a+b);
	}
	static void Sub()
	{
		int a = 400;
		int b = 100;
		System.out.println(a-b);
	}
	static void mul ()
	{
		int a = 100;
		int b = 10;
		System.out.println(a*b);
	}
	static void Div ()
	{
		int a = 600;
		int b = 200;
		System.out.println(a/b);
	}
	static void mod()
	{
		int a = 600;
		int b = 50;
		System.out.println(a%b);
	}
	public static void main(String[] args)
	{
		Add();
		Sub();
		mul();
		Div();
		mod();	
	}
	
}
